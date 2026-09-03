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
public final class ju0 extends org.telegram.ui.Components.rl0 {
    public final Context f38126c;
    public final PhotoViewer d;

    public ju0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f38126c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        PhotoViewer photoViewer = this.d;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null && ou0Var.c() != null) {
            return photoViewer.d.c().size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) m1Var.f5875a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f24494f = dp;
        org.telegram.ui.Components.np npVar = z5Var.f24492c;
        org.telegram.ui.Components.p9 p9Var = z5Var.f24490a;
        eg.q1 q1Var = z5Var.f24493e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f24491b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) p9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) q1Var.getLayoutParams()).rightMargin = i11;
        p9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            q1Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f38126c;
            if (str != null) {
                p9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                p9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    q1Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                p9Var.setImageResource(R.drawable.nophotos);
            }
            npVar.f29560a.f(-1, true, false);
            npVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            q1Var.setVisibility(4);
            npVar.f29560a.f(-1, true, false);
            npVar.setVisibility(0);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38126c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        frameLayout.f24490a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(p9Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f24491b = frameLayout2;
        frameLayout.addView(frameLayout2, k7.c6.e(42, 42, 53));
        eg.q1 q1Var = new eg.q1(context);
        q1Var.d = new Path();
        q1Var.f5445c = new float[8];
        q1Var.f5444b = new RectF();
        q1Var.f5446e = new Paint(1);
        frameLayout.f24493e = q1Var;
        q1Var.setWillNotDraw(false);
        q1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(q1Var, k7.c6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        q1Var.addView(imageView, k7.c6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q1Var.addView(textView, k7.c6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, null);
        frameLayout.f24492c = npVar;
        npVar.setDrawBackgroundAsArc(11);
        npVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        frameLayout.addView(npVar, k7.c6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new f60(this, 20));
        return new f2.m1(frameLayout);
    }
}
