package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27599a;
    public final c9 f27600b;

    public r8(c9 c9Var, int i10) {
        this.f27599a = i10;
        this.f27600b = c9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f27599a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f27600b.f22984f = false;
                return;
            default:
                c9 c9Var = this.f27600b;
                if (c9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c9Var.i0(f7, false);
                c9Var.F = false;
                return;
        }
    }
}
