package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class oq0 extends ImageView {
    public int f48529a;
    public boolean f48530b;
    public boolean f48531c;
    public boolean d;
    public org.telegram.ui.Components.s51 f48532e;
    public final org.telegram.ui.Components.xq f48533f;
    public ValueAnimator h;
    public final PhotoViewer f48534n;

    public oq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f48534n = photoViewer;
        this.f48529a = 0;
        this.f48530b = false;
        this.f48531c = false;
        this.d = false;
        this.f48533f = org.telegram.ui.Components.xq.f40331i;
        setAlpha(0.0f);
    }

    public static void a(oq0 oq0Var) {
        PhotoViewer photoViewer = oq0Var.f48534n;
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null && s51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = oq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    oq0Var.h = null;
                }
                oq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (oq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    oq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(oq0Var, 22));
                    oq0Var.h.setDuration(max);
                    oq0Var.h.setInterpolator(oq0Var.f48533f);
                    oq0Var.h.start();
                    oq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = oq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    oq0Var.h = null;
                }
                oq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = oq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            oq0Var.h = null;
        }
        oq0Var.setAlpha(0.0f);
    }
}
