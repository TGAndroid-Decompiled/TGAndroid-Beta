package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class i00 extends AnimatorListenerAdapter {
    public final int f24896a;
    public final int f24897b;
    public final float f24898c;
    public final View d;

    public i00(View view, int i10, float f7, int i11) {
        this.f24896a = i11;
        this.d = view;
        this.f24897b = i10;
        this.f24898c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24896a) {
            case 0:
                j00 j00Var = (j00) this.d;
                int i10 = this.f24897b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24898c;
                }
                j00Var.b(f7, i10 + 1);
                j00Var.f25228y = 0.0f;
                j00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f24897b, this.f24898c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47679c0 = this.f24898c;
                if (l8Var.getValue() != this.f24897b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public i00(yh.l8 l8Var, float f7, int i10) {
        this.f24896a = 2;
        this.d = l8Var;
        this.f24898c = f7;
        this.f24897b = i10;
    }
}
