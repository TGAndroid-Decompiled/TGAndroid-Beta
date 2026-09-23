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
public final class pu0 extends org.telegram.ui.Components.ll0 {
    public final Context f36210c;
    public final PhotoViewer d;

    public pu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f36210c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        uu0 uu0Var = photoViewer.d;
        if (uu0Var != null && uu0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.f42627a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f21673f = dp;
        org.telegram.ui.Components.op opVar = z5Var.f21672c;
        org.telegram.ui.Components.w9 w9Var = z5Var.f21670a;
        u5 u5Var = z5Var.e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f21671b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).rightMargin = i11;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            u5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f36210c;
            if (str != null) {
                w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    u5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                w9Var.setImageResource(R.drawable.nophotos);
            }
            opVar.f26827a.f(-1, true, false);
            opVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            u5Var.setVisibility(4);
            opVar.f26827a.f(-1, true, false);
            opVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36210c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        frameLayout.f21670a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(w9Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f21671b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.e(42, 42, 53));
        u5 u5Var = new u5(context);
        u5Var.f37909c = new Path();
        u5Var.d = new float[8];
        u5Var.f37908b = new RectF();
        u5Var.e = new Paint(1);
        frameLayout.e = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(u5Var, w7.x5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        u5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 24, null);
        frameLayout.f21672c = opVar;
        opVar.setDrawBackgroundAsArc(11);
        opVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        frameLayout.addView(opVar, w7.x5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        opVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new h60(this, 20));
        return new s4.c1(frameLayout);
    }
}
