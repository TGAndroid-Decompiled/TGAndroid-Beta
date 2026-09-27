package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j00 extends AnimatorListenerAdapter {
    public final int f25273a;
    public final int f25274b;
    public final float f25275c;
    public final View d;

    public j00(View view, int i10, float f7, int i11) {
        this.f25273a = i11;
        this.d = view;
        this.f25274b = i10;
        this.f25275c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25273a) {
            case 0:
                k00 k00Var = (k00) this.d;
                int i10 = this.f25274b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f25275c;
                }
                k00Var.b(f7, i10 + 1);
                k00Var.f25585y = 0.0f;
                k00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f25274b, this.f25275c, false);
                return;
            default:
                yh.k8 k8Var = (yh.k8) this.d;
                k8Var.f47690c0 = this.f25275c;
                if (k8Var.getValue() != this.f25274b) {
                    k8Var.e(k8Var.getValue());
                }
                k8Var.invalidate();
                return;
        }
    }

    public j00(yh.k8 k8Var, float f7, int i10) {
        this.f25273a = 2;
        this.d = k8Var;
        this.f25275c = f7;
        this.f25274b = i10;
    }
}
