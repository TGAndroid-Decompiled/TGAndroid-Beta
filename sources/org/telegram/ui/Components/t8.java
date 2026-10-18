package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f30493a;
    public final e9 f30494b;

    public t8(e9 e9Var, int i10) {
        this.f30493a = i10;
        this.f30494b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30493a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30494b.f25886f = false;
                return;
            default:
                e9 e9Var = this.f30494b;
                if (e9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                e9Var.F = false;
                return;
        }
    }
}
