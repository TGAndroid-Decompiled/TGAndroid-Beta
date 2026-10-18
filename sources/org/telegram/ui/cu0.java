package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class cu0 extends ImageView {
    public int f36004a;
    public boolean f36005b;
    public boolean f36006c;
    public boolean d;
    public org.telegram.ui.Components.a81 e;
    public final org.telegram.ui.Components.bs f36007f;
    public ValueAnimator h;
    public final PhotoViewer f36008n;

    public cu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36008n = photoViewer;
        this.f36004a = 0;
        this.f36005b = false;
        this.f36006c = false;
        this.d = false;
        this.f36007f = org.telegram.ui.Components.bs.f25039i;
        setAlpha(0.0f);
    }

    public static void a(cu0 cu0Var) {
        PhotoViewer photoViewer = cu0Var.f36008n;
        org.telegram.ui.Components.a81 a81Var = photoViewer.F2;
        if (a81Var != null && a81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = cu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cu0Var.h = null;
                }
                cu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (cu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    cu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(cu0Var, 24));
                    cu0Var.h.setDuration(max);
                    cu0Var.h.setInterpolator(cu0Var.f36007f);
                    cu0Var.h.start();
                    cu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = cu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    cu0Var.h = null;
                }
                cu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = cu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            cu0Var.h = null;
        }
        cu0Var.setAlpha(0.0f);
    }
}
