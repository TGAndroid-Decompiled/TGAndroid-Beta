package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class i00 extends AnimatorListenerAdapter {
    public final int f24841a;
    public final int f24842b;
    public final float f24843c;
    public final View d;

    public i00(View view, int i10, float f7, int i11) {
        this.f24841a = i11;
        this.d = view;
        this.f24842b = i10;
        this.f24843c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24841a) {
            case 0:
                j00 j00Var = (j00) this.d;
                int i10 = this.f24842b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24843c;
                }
                j00Var.b(f7, i10 + 1);
                j00Var.f25108y = 0.0f;
                j00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.u1) this.d).c(this.f24842b, this.f24843c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47361c0 = this.f24843c;
                if (l8Var.getValue() != this.f24842b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public i00(yh.l8 l8Var, float f7, int i10) {
        this.f24841a = 2;
        this.d = l8Var;
        this.f24843c = f7;
        this.f24842b = i10;
    }
}
