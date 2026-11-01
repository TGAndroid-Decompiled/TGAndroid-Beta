package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class h0 extends AnimatorListenerAdapter {
    public final int f31525a;
    public final m0 f31526b;

    public h0(m0 m0Var, int i10) {
        this.f31525a = i10;
        this.f31526b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31525a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f31526b;
                if (m0Var.getParent() != null) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f31526b;
                if (m0Var2.getParent() != null) {
                    ((ViewGroup) m0Var2.getParent()).removeView(m0Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                m0 m0Var3 = this.f31526b;
                if (m0Var3.getParent() != null) {
                    ((ViewGroup) m0Var3.getParent()).removeView(m0Var3);
                    return;
                }
                return;
        }
    }
}
