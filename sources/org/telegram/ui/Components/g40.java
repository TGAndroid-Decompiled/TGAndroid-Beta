package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g40 extends AnimatorListenerAdapter {
    public final int f35415a;
    public final c50 f35416b;

    public g40(c50 c50Var, int i7) {
        this.f35415a = i7;
        this.f35416b = c50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35415a) {
            case 0:
                c50 c50Var = this.f35416b;
                if (animator.equals(c50Var.L)) {
                    c50Var.L = null;
                    return;
                }
                return;
            case 1:
                c50 c50Var2 = this.f35416b;
                if (c50Var2.l1 != null) {
                    c50Var2.l1 = null;
                    return;
                }
                return;
            default:
                c50 c50Var3 = this.f35416b;
                if (animator.equals(c50Var3.f34024e0)) {
                    c50Var3.d(true);
                    c50Var3.f34030g1 = false;
                    c50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
