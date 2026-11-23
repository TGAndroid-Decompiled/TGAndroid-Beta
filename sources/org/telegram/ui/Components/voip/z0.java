package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class z0 extends AnimatorListenerAdapter {
    public final int f41393a;
    public final d1 f41394b;

    public z0(d1 d1Var, int i7) {
        this.f41393a = i7;
        this.f41394b = d1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41393a) {
            case 0:
                super.onAnimationEnd(animator);
                d1 d1Var = this.f41394b;
                if (d1Var.getParent() != null) {
                    ((ViewGroup) d1Var.getParent()).removeView(d1Var);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f41394b;
                if (d1Var2.getParent() != null) {
                    ((ViewGroup) d1Var2.getParent()).removeView(d1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                d1 d1Var3 = this.f41394b;
                if (d1Var3.getParent() != null) {
                    ((ViewGroup) d1Var3.getParent()).removeView(d1Var3);
                    return;
                }
                return;
        }
    }
}
