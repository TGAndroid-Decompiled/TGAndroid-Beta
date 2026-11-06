package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class nq0 extends ImageView {
    public int f48086a;
    public boolean f48087b;
    public boolean f48088c;
    public boolean d;
    public org.telegram.ui.Components.n51 f48089e;
    public final org.telegram.ui.Components.xq f48090f;
    public ValueAnimator h;
    public final PhotoViewer f48091n;

    public nq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f48091n = photoViewer;
        this.f48086a = 0;
        this.f48087b = false;
        this.f48088c = false;
        this.d = false;
        this.f48090f = org.telegram.ui.Components.xq.f40312i;
        setAlpha(0.0f);
    }

    public static void a(nq0 nq0Var) {
        PhotoViewer photoViewer = nq0Var.f48091n;
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null && n51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = nq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nq0Var.h = null;
                }
                nq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (nq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    nq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(nq0Var, 22));
                    nq0Var.h.setDuration(max);
                    nq0Var.h.setInterpolator(nq0Var.f48090f);
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
