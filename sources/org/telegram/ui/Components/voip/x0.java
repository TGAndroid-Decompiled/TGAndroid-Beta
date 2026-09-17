package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x0 extends AnimatorListenerAdapter {
    public final int f31948a;
    public final b1 f31949b;

    public x0(b1 b1Var, int i10) {
        this.f31948a = i10;
        this.f31949b = b1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31948a) {
            case 0:
                super.onAnimationEnd(animator);
                b1 b1Var = this.f31949b;
                if (b1Var.getParent() != null) {
                    ((ViewGroup) b1Var.getParent()).removeView(b1Var);
                    return;
                }
                return;
            case 1:
                b1 b1Var2 = this.f31949b;
                if (b1Var2.getParent() != null) {
                    ((ViewGroup) b1Var2.getParent()).removeView(b1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                b1 b1Var3 = this.f31949b;
                if (b1Var3.getParent() != null) {
                    ((ViewGroup) b1Var3.getParent()).removeView(b1Var3);
                    return;
                }
                return;
        }
    }
}
