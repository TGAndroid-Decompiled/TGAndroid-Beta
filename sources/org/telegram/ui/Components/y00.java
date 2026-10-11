package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class y00 extends AnimatorListenerAdapter {
    public final int f33106a;
    public final int f33107b;
    public final float f33108c;
    public final View d;

    public y00(View view, int i10, float f7, int i11) {
        this.f33106a = i11;
        this.d = view;
        this.f33107b = i10;
        this.f33108c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f33106a) {
            case 0:
                z00 z00Var = (z00) this.d;
                int i10 = this.f33107b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f33108c;
                }
                z00Var.b(f7, i10 + 1);
                z00Var.f33528y = 0.0f;
                z00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.u1) this.d).c(this.f33107b, this.f33108c, false);
                return;
            default:
                yh.e8 e8Var = (yh.e8) this.d;
                e8Var.f52571c0 = this.f33108c;
                if (e8Var.getValue() != this.f33107b) {
                    e8Var.e(e8Var.getValue());
                }
                e8Var.invalidate();
                return;
        }
    }

    public y00(yh.e8 e8Var, float f7, int i10) {
        this.f33106a = 2;
        this.d = e8Var;
        this.f33108c = f7;
        this.f33107b = i10;
    }
}
