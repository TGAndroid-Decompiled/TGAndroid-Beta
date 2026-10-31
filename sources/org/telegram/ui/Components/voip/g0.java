package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class g0 extends AnimatorListenerAdapter {
    public final int f31446a;
    public final l0 f31447b;

    public g0(l0 l0Var, int i10) {
        this.f31446a = i10;
        this.f31447b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31446a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31447b;
                if (l0Var.getParent() != null) {
                    ((ViewGroup) l0Var.getParent()).removeView(l0Var);
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f31447b;
                if (l0Var2.getParent() != null) {
                    ((ViewGroup) l0Var2.getParent()).removeView(l0Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                l0 l0Var3 = this.f31447b;
                if (l0Var3.getParent() != null) {
                    ((ViewGroup) l0Var3.getParent()).removeView(l0Var3);
                    return;
                }
                return;
        }
    }
}
