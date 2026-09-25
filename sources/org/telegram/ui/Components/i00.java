package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class i00 extends AnimatorListenerAdapter {
    public final int f24897a;
    public final int f24898b;
    public final float f24899c;
    public final View d;

    public i00(View view, int i10, float f7, int i11) {
        this.f24897a = i11;
        this.d = view;
        this.f24898b = i10;
        this.f24899c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24897a) {
            case 0:
                j00 j00Var = (j00) this.d;
                int i10 = this.f24898b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24899c;
                }
                j00Var.b(f7, i10 + 1);
                j00Var.f25229y = 0.0f;
                j00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f24898b, this.f24899c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47680c0 = this.f24899c;
                if (l8Var.getValue() != this.f24898b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public i00(yh.l8 l8Var, float f7, int i10) {
        this.f24897a = 2;
        this.d = l8Var;
        this.f24899c = f7;
        this.f24898b = i10;
    }
}
