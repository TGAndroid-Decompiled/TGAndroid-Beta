package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n8 extends AnimatorListenerAdapter {
    public final int f37830a;
    public final y8 f37831b;

    public n8(y8 y8Var, int i7) {
        this.f37830a = i7;
        this.f37831b = y8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f37830a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37831b.f42350f = false;
                return;
            default:
                y8 y8Var = this.f37831b;
                if (y8Var.G) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y8Var.n0(false, f10);
                y8Var.G = false;
                return;
        }
    }
}
