package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class nu0 extends ImageView {
    public int f35602a;
    public boolean f35603b;
    public boolean f35604c;
    public boolean d;
    public org.telegram.ui.Components.f71 e;
    public final org.telegram.ui.Components.rr f35605f;
    public ValueAnimator h;
    public final PhotoViewer f35606n;

    public nu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35606n = photoViewer;
        this.f35602a = 0;
        this.f35603b = false;
        this.f35604c = false;
        this.d = false;
        this.f35605f = org.telegram.ui.Components.rr.f27703i;
        setAlpha(0.0f);
    }

    public static void a(nu0 nu0Var) {
        PhotoViewer photoViewer = nu0Var.f35606n;
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        if (f71Var != null && f71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = nu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nu0Var.h = null;
                }
                nu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (nu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    nu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new c3(nu0Var, 24));
                    nu0Var.h.setDuration(max);
                    nu0Var.h.setInterpolator(nu0Var.f35605f);
                    nu0Var.h.start();
                    nu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = nu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    nu0Var.h = null;
                }
                nu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = nu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            nu0Var.h = null;
        }
        nu0Var.setAlpha(0.0f);
    }
}
