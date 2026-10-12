package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s50 extends AnimatorListenerAdapter {
    public final int f29037a;
    public final p60 f29038b;

    public s50(p60 p60Var, int i10) {
        this.f29037a = i10;
        this.f29038b = p60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29037a) {
            case 0:
                p60 p60Var = this.f29038b;
                if (animator.equals(p60Var.L)) {
                    p60Var.L = null;
                    return;
                }
                return;
            case 1:
                p60 p60Var2 = this.f29038b;
                if (p60Var2.l1 != null) {
                    p60Var2.l1 = null;
                    return;
                }
                return;
            default:
                p60 p60Var3 = this.f29038b;
                if (animator.equals(p60Var3.f28166e0)) {
                    p60Var3.c(true);
                    p60Var3.f28172g1 = false;
                    p60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
