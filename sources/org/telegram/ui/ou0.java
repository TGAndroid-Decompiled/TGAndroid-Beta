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
public final class ou0 extends org.telegram.ui.Components.vl0 {
    public final Context f36348c;
    public final PhotoViewer d;

    public ou0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f36348c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        tu0 tu0Var = photoViewer.d;
        if (tu0Var != null && tu0Var.c() != null) {
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.f42961a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f21912f = dp;
        org.telegram.ui.Components.op opVar = z5Var.f21911c;
        org.telegram.ui.Components.w9 w9Var = z5Var.f21909a;
        t5 t5Var = z5Var.e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f21910b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).rightMargin = i11;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            t5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f36348c;
            if (str != null) {
                w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                w9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    t5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                w9Var.setImageResource(R.drawable.nophotos);
            }
            opVar.f27168a.f(-1, true, false);
            opVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            t5Var.setVisibility(4);
            opVar.f27168a.f(-1, true, false);
            opVar.setVisibility(0);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36348c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        frameLayout.f21909a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(w9Var, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f21910b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.y5.e(42, 42, 53));
        t5 t5Var = new t5(context);
        t5Var.f37970c = new Path();
        t5Var.d = new float[8];
        t5Var.f37969b = new RectF();
        t5Var.e = new Paint(1);
        frameLayout.e = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(t5Var, w7.y5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        t5Var.addView(imageView, w7.y5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        t5Var.addView(textView, w7.y5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 24, null);
        frameLayout.f21911c = opVar;
        opVar.setDrawBackgroundAsArc(11);
        opVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        frameLayout.addView(opVar, w7.y5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        opVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new f60(this, 20));
        return new s4.c1(frameLayout);
    }
}
