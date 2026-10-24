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
public final class eu0 extends org.telegram.ui.Components.km0 {
    public final Context f37000c;
    public final PhotoViewer d;

    public eu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.f37000c = context;
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) b1Var.f46342a;
        int dp = AndroidUtilities.dp(85.0f);
        if (i10 != 0) {
            i11 = AndroidUtilities.dp(6.0f);
        } else {
            i11 = 0;
        }
        z5Var.f24026f = dp;
        org.telegram.ui.Components.vp vpVar = z5Var.f24025c;
        org.telegram.ui.Components.u9 u9Var = z5Var.f24023a;
        ai.o5 o5Var = z5Var.e;
        z5Var.h = i11;
        ((FrameLayout.LayoutParams) z5Var.f24024b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) u9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) o5Var.getLayoutParams()).rightMargin = i11;
        u9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            z5Var.setTag(photoEntry);
            o5Var.setVisibility(4);
            String str = photoEntry.thumbPath;
            Context context = this.f37000c;
            if (str != null) {
                u9Var.g(str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else if (photoEntry.path != null) {
                u9Var.p(photoEntry.orientation, photoEntry.invert, true);
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    o5Var.setVisibility(0);
                    z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                    u9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                } else {
                    u9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
                }
            } else {
                u9Var.setImageResource(R.drawable.nophotos);
            }
            vpVar.f32005a.f(-1, true, false);
            vpVar.setVisibility(0);
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            z5Var.setTag(searchImage);
            z5Var.setImage(searchImage);
            o5Var.setVisibility(4);
            vpVar.f32005a.f(-1, true, false);
            vpVar.setVisibility(0);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f37000c;
        ?? frameLayout = new FrameLayout(context);
        new Paint();
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        frameLayout.f24023a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        frameLayout.addView(u9Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.f24024b = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.e(42, 42, 53));
        ai.o5 o5Var = new ai.o5(context);
        o5Var.d = new Path();
        o5Var.e = new float[8];
        o5Var.f1935b = new RectF();
        o5Var.f1936c = new Paint(1);
        frameLayout.e = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        frameLayout.addView(o5Var, w7.z5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        o5Var.addView(imageView, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        frameLayout.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        o5Var.addView(textView, w7.z5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, 24, null);
        frameLayout.f24025c = vpVar;
        vpVar.setDrawBackgroundAsArc(11);
        vpVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        frameLayout.addView(vpVar, w7.z5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        vpVar.setVisibility(0);
        frameLayout.setFocusable(true);
        frameLayout2.setOnClickListener(new w50(this, 20));
        return new s4.b1(frameLayout);
    }
}
