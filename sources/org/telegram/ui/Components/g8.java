package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g8 extends AnimatorListenerAdapter {
    public final int f34019a;
    public final r8 f34020b;

    public g8(r8 r8Var, int i3) {
        this.f34019a = i3;
        this.f34020b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f34019a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34020b.f37674f = false;
                return;
            default:
                r8 r8Var = this.f34020b;
                if (r8Var.G) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r8Var.n0(false, f10);
                r8Var.G = false;
                return;
        }
    }
}
