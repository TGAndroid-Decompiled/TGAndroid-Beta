package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d40 extends AnimatorListenerAdapter {
    public final int f34273a;
    public final z40 f34274b;

    public d40(z40 z40Var, int i7) {
        this.f34273a = i7;
        this.f34274b = z40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34273a) {
            case 0:
                z40 z40Var = this.f34274b;
                if (animator.equals(z40Var.L)) {
                    z40Var.L = null;
                    return;
                }
                return;
            case 1:
                z40 z40Var2 = this.f34274b;
                if (z40Var2.l1 != null) {
                    z40Var2.l1 = null;
                    return;
                }
                return;
            default:
                z40 z40Var3 = this.f34274b;
                if (animator.equals(z40Var3.f42771e0)) {
                    z40Var3.d(true);
                    z40Var3.f42777g1 = false;
                    z40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
