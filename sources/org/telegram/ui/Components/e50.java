package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e50 extends AnimatorListenerAdapter {
    public final int f23786a;
    public final b60 f23787b;

    public e50(b60 b60Var, int i10) {
        this.f23786a = i10;
        this.f23787b = b60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23786a) {
            case 0:
                b60 b60Var = this.f23787b;
                if (animator.equals(b60Var.J)) {
                    b60Var.J = null;
                    return;
                }
                return;
            case 1:
                b60 b60Var2 = this.f23787b;
                if (b60Var2.f22837e1 != null) {
                    b60Var2.f22837e1 = null;
                    return;
                }
                return;
            default:
                b60 b60Var3 = this.f23787b;
                if (animator.equals(b60Var3.f22832c0)) {
                    b60Var3.d(true);
                    b60Var3.Z0 = false;
                    b60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
