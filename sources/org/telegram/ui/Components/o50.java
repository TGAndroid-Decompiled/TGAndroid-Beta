package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o50 extends AnimatorListenerAdapter {
    public final int f28894a;
    public final m60 f28895b;

    public o50(m60 m60Var, int i10) {
        this.f28894a = i10;
        this.f28895b = m60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28894a) {
            case 0:
                m60 m60Var = this.f28895b;
                if (animator.equals(m60Var.L)) {
                    m60Var.L = null;
                    return;
                }
                return;
            case 1:
                m60 m60Var2 = this.f28895b;
                if (m60Var2.l1 != null) {
                    m60Var2.l1 = null;
                    return;
                }
                return;
            default:
                m60 m60Var3 = this.f28895b;
                if (animator.equals(m60Var3.f28425e0)) {
                    m60Var3.c(true);
                    m60Var3.f28431g1 = false;
                    m60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
