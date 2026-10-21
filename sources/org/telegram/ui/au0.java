package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class au0 extends ImageView {
    public int f35422a;
    public boolean f35423b;
    public boolean f35424c;
    public boolean d;
    public org.telegram.ui.Components.c81 e;
    public final org.telegram.ui.Components.bs f35425f;
    public ValueAnimator h;
    public final PhotoViewer f35426n;

    public au0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35426n = photoViewer;
        this.f35422a = 0;
        this.f35423b = false;
        this.f35424c = false;
        this.d = false;
        this.f35425f = org.telegram.ui.Components.bs.f25023i;
        setAlpha(0.0f);
    }

    public static void a(au0 au0Var) {
        PhotoViewer photoViewer = au0Var.f35426n;
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        if (c81Var != null && c81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = au0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    au0Var.h = null;
                }
                au0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (au0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    au0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(au0Var, 24));
                    au0Var.h.setDuration(max);
                    au0Var.h.setInterpolator(au0Var.f35425f);
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
