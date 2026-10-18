package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class eu0 extends org.telegram.ui.Components.hm0 {
    public final Context f36601c;
    public final PhotoViewer d;

    public eu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f36601c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        ju0 ju0Var = photoViewer.d;
        if (ju0Var != null && ju0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) b1Var.f45910a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        y5Var.f23836f = dp;
        org.telegram.ui.Components.xp xpVar = y5Var.f23835c;
        org.telegram.ui.Components.w9 w9Var = y5Var.f23833a;
        ai.n5 n5Var = y5Var.e;
        y5Var.h = i11;
        ((FrameLayout.LayoutParams) y5Var.f23834b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) n5Var.getLayoutParams()).rightMargin = i11;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            y5Var.setTag(photoEntry);
            n5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f36601c;
            if (str != null) {
                w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    n5Var.setVisibility(0);
                    y5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                w9Var.setImageResource(R.drawable.nophotos);
            }
            xpVar.f32428a.f(-1, true, false);
            xpVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            y5Var.setTag(searchImage);
            y5Var.setImage(searchImage);
            n5Var.setVisibility(4);
            xpVar.f32428a.f(-1, true, false);
            xpVar.setVisibility(0);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36601c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        frameLayout.f23833a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(w9Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f23834b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.e(42, 42, 53));
        ai.n5 n5Var = new ai.n5(context);
        n5Var.d = new Path();
        n5Var.e = new float[8];
        n5Var.f1892b = new RectF();
        n5Var.f1893c = new Paint(1);
        frameLayout.e = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(n5Var, w7.z5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        n5Var.addView(imageView, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, w7.z5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, null);
        frameLayout.f23835c = xpVar;
        xpVar.setDrawBackgroundAsArc(11);
        xpVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        frameLayout.addView(xpVar, w7.z5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        xpVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new y50(this, 19));
        return new s4.b1(frameLayout);
    }
}
