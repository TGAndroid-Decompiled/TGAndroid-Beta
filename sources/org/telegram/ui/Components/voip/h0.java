package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class h0 extends AnimatorListenerAdapter {
    public final int f39381a;
    public final l0 f39382b;

    public h0(l0 l0Var, int i3) {
        this.f39381a = i3;
        this.f39382b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39381a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f39382b;
                if (l0Var.getParent() != null) {
                    ((ViewGroup) l0Var.getParent()).removeView(l0Var);
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f39382b;
                if (l0Var2.getParent() != null) {
                    ((ViewGroup) l0Var2.getParent()).removeView(l0Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                l0 l0Var3 = this.f39382b;
                if (l0Var3.getParent() != null) {
                    ((ViewGroup) l0Var3.getParent()).removeView(l0Var3);
                    return;
                }
                return;
        }
    }
}
