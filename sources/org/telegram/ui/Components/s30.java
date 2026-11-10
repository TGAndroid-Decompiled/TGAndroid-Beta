package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s30 extends AnimatorListenerAdapter {
    public final int f37845a;
    public final o40 f37846b;

    public s30(o40 o40Var, int i7) {
        this.f37845a = i7;
        this.f37846b = o40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37845a) {
            case 0:
                o40 o40Var = this.f37846b;
                if (animator.equals(o40Var.K)) {
                    o40Var.K = null;
                    return;
                }
                return;
            case 1:
                o40 o40Var2 = this.f37846b;
                if (o40Var2.f36497k1 != null) {
                    o40Var2.f36497k1 = null;
                    return;
                }
                return;
            default:
                o40 o40Var3 = this.f37846b;
                if (animator.equals(o40Var3.f36480d0)) {
                    o40Var3.d(true);
                    o40Var3.f36487f1 = false;
                    o40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
