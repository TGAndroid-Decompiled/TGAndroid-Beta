package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class au0 extends ImageView {
    public int f32702a;
    public boolean f32703b;
    public boolean f32704c;
    public boolean d;
    public org.telegram.ui.Components.i71 e;
    public final org.telegram.ui.Components.nr f32705f;
    public ValueAnimator h;
    public final PhotoViewer f32706n;

    public au0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f32706n = photoViewer;
        this.f32702a = 0;
        this.f32703b = false;
        this.f32704c = false;
        this.d = false;
        this.f32705f = org.telegram.ui.Components.nr.f27348i;
        setAlpha(0.0f);
    }

    public static void a(au0 au0Var) {
        PhotoViewer photoViewer = au0Var.f32706n;
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var != null && i71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = au0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    au0Var.h = null;
                }
                au0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.C2.y()) {
                if (au0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    au0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(au0Var, 24));
                    au0Var.h.setDuration(max);
                    au0Var.h.setInterpolator(au0Var.f32705f);
                    au0Var.h.start();
                    au0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = au0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    au0Var.h = null;
                }
                au0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = au0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            au0Var.h = null;
        }
        au0Var.setAlpha(0.0f);
    }
}
