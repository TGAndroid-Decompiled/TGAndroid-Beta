package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class pq0 extends ImageView {
    public int f50878a;
    public boolean f50879b;
    public boolean f50880c;
    public boolean d;
    public org.telegram.ui.Components.f61 f50881e;
    public final org.telegram.ui.Components.lr f50882f;
    public ValueAnimator h;
    public final PhotoViewer f50883n;

    public pq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f50883n = photoViewer;
        this.f50878a = 0;
        this.f50879b = false;
        this.f50880c = false;
        this.d = false;
        this.f50882f = org.telegram.ui.Components.lr.f37210i;
        setAlpha(0.0f);
    }

    public static void a(pq0 pq0Var) {
        PhotoViewer photoViewer = pq0Var.f50883n;
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null && f61Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = pq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    pq0Var.h = null;
                }
                pq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.G2.d0()) {
                if (pq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    pq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(pq0Var, 22));
                    pq0Var.h.setDuration(max);
                    pq0Var.h.setInterpolator(pq0Var.f50882f);
                    pq0Var.h.start();
                    pq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = pq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    pq0Var.h = null;
                }
                pq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = pq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            pq0Var.h = null;
        }
        pq0Var.setAlpha(0.0f);
    }
}
