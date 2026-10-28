package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class ju0 extends ImageView {
    public int f40614a;
    public boolean f40615b;
    public boolean f40616c;
    public boolean d;
    public org.telegram.ui.Components.t81 e;
    public final org.telegram.ui.Components.ds f40617f;
    public ValueAnimator h;
    public final PhotoViewer f40618n;

    public ju0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40618n = photoViewer;
        this.f40614a = 0;
        this.f40615b = false;
        this.f40616c = false;
        this.d = false;
        this.f40617f = org.telegram.ui.Components.ds.f27532i;
        setAlpha(0.0f);
    }

    public static void a(ju0 ju0Var) {
        PhotoViewer photoViewer = ju0Var.f40618n;
        org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
        if (t81Var != null && t81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = ju0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ju0Var.h = null;
                }
                ju0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (ju0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    ju0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new b3(ju0Var, 23));
                    ju0Var.h.setDuration(max);
                    ju0Var.h.setInterpolator(ju0Var.f40617f);
                    ju0Var.h.start();
                    ju0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = ju0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    ju0Var.h = null;
                }
                ju0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = ju0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            ju0Var.h = null;
        }
        ju0Var.setAlpha(0.0f);
    }
}
