package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f28444a;
    public final e9 f28445b;

    public t8(e9 e9Var, int i10) {
        this.f28444a = i10;
        this.f28445b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28444a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28445b.f23884f = false;
                return;
            default:
                e9 e9Var = this.f28445b;
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
