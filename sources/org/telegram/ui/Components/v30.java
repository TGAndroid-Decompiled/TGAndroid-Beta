package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v30 extends AnimatorListenerAdapter {
    public final int f40248a;
    public final r40 f40249b;

    public v30(r40 r40Var, int i7) {
        this.f40248a = i7;
        this.f40249b = r40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40248a) {
            case 0:
                r40 r40Var = this.f40249b;
                if (animator.equals(r40Var.L)) {
                    r40Var.L = null;
                    return;
                }
                return;
            case 1:
                r40 r40Var2 = this.f40249b;
                if (r40Var2.l1 != null) {
                    r40Var2.l1 = null;
                    return;
                }
                return;
            default:
                r40 r40Var3 = this.f40249b;
                if (animator.equals(r40Var3.f38845e0)) {
                    r40Var3.d(true);
                    r40Var3.f38851g1 = false;
                    r40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
