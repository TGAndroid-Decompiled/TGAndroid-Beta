package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w0 extends AnimatorListenerAdapter {
    public final int f30008a;
    public final a1 f30009b;

    public w0(a1 a1Var, int i10) {
        this.f30008a = i10;
        this.f30009b = a1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30008a) {
            case 0:
                super.onAnimationEnd(animator);
                a1 a1Var = this.f30009b;
                if (a1Var.getParent() != null) {
                    ((ViewGroup) a1Var.getParent()).removeView(a1Var);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f30009b;
                if (a1Var2.getParent() != null) {
                    ((ViewGroup) a1Var2.getParent()).removeView(a1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                a1 a1Var3 = this.f30009b;
                if (a1Var3.getParent() != null) {
                    ((ViewGroup) a1Var3.getParent()).removeView(a1Var3);
                    return;
                }
                return;
        }
    }
}
