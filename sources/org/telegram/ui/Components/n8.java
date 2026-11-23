package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n8 extends AnimatorListenerAdapter {
    public final int f37829a;
    public final y8 f37830b;

    public n8(y8 y8Var, int i7) {
        this.f37829a = i7;
        this.f37830b = y8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f37829a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37830b.f42349f = false;
                return;
            default:
                y8 y8Var = this.f37830b;
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
