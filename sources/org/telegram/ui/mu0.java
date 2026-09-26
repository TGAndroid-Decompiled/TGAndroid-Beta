package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class mu0 extends ImageView {
    public int f35670a;
    public boolean f35671b;
    public boolean f35672c;
    public boolean d;
    public org.telegram.ui.Components.t71 e;
    public final org.telegram.ui.Components.sr f35673f;
    public ValueAnimator h;
    public final PhotoViewer f35674n;

    public mu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35674n = photoViewer;
        this.f35670a = 0;
        this.f35671b = false;
        this.f35672c = false;
        this.d = false;
        this.f35673f = org.telegram.ui.Components.sr.f28341i;
        setAlpha(0.0f);
    }

    public static void a(mu0 mu0Var) {
        PhotoViewer photoViewer = mu0Var.f35674n;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var != null && t71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = mu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    mu0Var.h = null;
                }
                mu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (mu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    mu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new c3(mu0Var, 24));
                    mu0Var.h.setDuration(max);
                    mu0Var.h.setInterpolator(mu0Var.f35673f);
                    mu0Var.h.start();
                    mu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = mu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    mu0Var.h = null;
                }
                mu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = mu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            mu0Var.h = null;
        }
        mu0Var.setAlpha(0.0f);
    }
}
