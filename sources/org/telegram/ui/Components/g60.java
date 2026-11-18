package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g60 extends AnimatorListenerAdapter {
    public final int f35357a;
    public final i60 f35358b;

    public g60(i60 i60Var, int i7) {
        this.f35357a = i7;
        this.f35358b = i60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35357a) {
            case 0:
                i60 i60Var = this.f35358b;
                i60Var.f36066e.Y1 = null;
                i60Var.requestLayout();
                return;
            default:
                i60 i60Var2 = this.f35358b;
                i60Var2.f36066e.Y1 = null;
                i60Var2.f36063a = false;
                return;
        }
    }
}
