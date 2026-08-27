package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class t40 extends AnimatorListenerAdapter {

    public final int f32649a;

    public final k50 f32650b;

    public t40(k50 k50Var, int i10) {
        this.f32649a = i10;
        this.f32650b = k50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32649a) {
            case 0:
                k50 k50Var = this.f32650b;
                if (animator.equals(k50Var.C)) {
                    k50Var.C = null;
                }
                break;
            case 1:
                k50 k50Var2 = this.f32650b;
                if (k50Var2.X0 != null) {
                    k50Var2.X0 = null;
                }
                break;
            default:
                k50 k50Var3 = this.f32650b;
                if (animator.equals(k50Var3.S)) {
                    k50Var3.h(true);
                    k50Var3.S0 = false;
                    k50Var3.setVisibility(4);
                }
                break;
        }
    }
}
