package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class nq0 extends ImageView {
    public int f49596a;
    public boolean f49597b;
    public boolean f49598c;
    public boolean d;
    public org.telegram.ui.Components.u51 f49599e;
    public final org.telegram.ui.Components.er f49600f;
    public ValueAnimator h;
    public final PhotoViewer f49601n;

    public nq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f49601n = photoViewer;
        this.f49596a = 0;
        this.f49597b = false;
        this.f49598c = false;
        this.d = false;
        this.f49600f = org.telegram.ui.Components.er.f34421i;
        setAlpha(0.0f);
    }

    public static void a(nq0 nq0Var) {
        PhotoViewer photoViewer = nq0Var.f49601n;
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null && u51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = nq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nq0Var.h = null;
                }
                nq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.G2.d0()) {
                if (nq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    nq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(nq0Var, 22));
                    nq0Var.h.setDuration(max);
                    nq0Var.h.setInterpolator(nq0Var.f49600f);
                    nq0Var.h.start();
                    nq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = nq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    nq0Var.h = null;
                }
                nq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = nq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            nq0Var.h = null;
        }
        nq0Var.setAlpha(0.0f);
    }
}
