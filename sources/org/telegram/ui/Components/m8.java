package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m8 extends AnimatorListenerAdapter {
    public final int f37427a;
    public final x8 f37428b;

    public m8(x8 x8Var, int i7) {
        this.f37427a = i7;
        this.f37428b = x8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f37427a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37428b.f41925f = false;
                return;
            default:
                x8 x8Var = this.f37428b;
                if (x8Var.G) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x8Var.n0(false, f10);
                x8Var.G = false;
                return;
        }
    }
}
