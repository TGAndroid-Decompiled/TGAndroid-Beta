package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class bv0 extends ImageView {
    public int f34632a;
    public boolean f34633b;
    public boolean f34634c;
    public boolean d;
    public org.telegram.ui.Components.h81 e;
    public final org.telegram.ui.Components.es f34635f;
    public ValueAnimator h;
    public final PhotoViewer f34636n;

    public bv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f34636n = photoViewer;
        this.f34632a = 0;
        this.f34633b = false;
        this.f34634c = false;
        this.d = false;
        this.f34635f = org.telegram.ui.Components.es.f24773i;
        setAlpha(0.0f);
    }

    public static void a(bv0 bv0Var) {
        PhotoViewer photoViewer = bv0Var.f34636n;
        org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
        if (h81Var != null && h81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = bv0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    bv0Var.h = null;
                }
                bv0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (bv0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    bv0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(bv0Var, 24));
                    bv0Var.h.setDuration(max);
                    bv0Var.h.setInterpolator(bv0Var.f34635f);
                    bv0Var.h.start();
                    bv0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = bv0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    bv0Var.h = null;
                }
                bv0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = bv0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            bv0Var.h = null;
        }
        bv0Var.setAlpha(0.0f);
    }
}
