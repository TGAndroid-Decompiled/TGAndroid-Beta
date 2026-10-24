package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m50 extends AnimatorListenerAdapter {
    public final int f28513a;
    public final l60 f28514b;

    public m50(l60 l60Var, int i10) {
        this.f28513a = i10;
        this.f28514b = l60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28513a) {
            case 0:
                l60 l60Var = this.f28514b;
                if (animator.equals(l60Var.L)) {
                    l60Var.L = null;
                    return;
                }
                return;
            case 1:
                l60 l60Var2 = this.f28514b;
                if (l60Var2.l1 != null) {
                    l60Var2.l1 = null;
                    return;
                }
                return;
            default:
                l60 l60Var3 = this.f28514b;
                if (animator.equals(l60Var3.f28186e0)) {
                    l60Var3.c(true);
                    l60Var3.f28192g1 = false;
                    l60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
