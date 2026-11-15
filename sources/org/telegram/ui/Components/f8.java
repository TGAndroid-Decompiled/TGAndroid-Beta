package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f8 extends AnimatorListenerAdapter {
    public final int f34539a;
    public final q8 f34540b;

    public f8(q8 q8Var, int i7) {
        this.f34539a = i7;
        this.f34540b = q8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f34539a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34540b.f38569f = false;
                return;
            default:
                q8 q8Var = this.f34540b;
                if (q8Var.G) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q8Var.n0(false, f10);
                q8Var.G = false;
                return;
        }
    }
}
