package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class y0 extends AnimatorListenerAdapter {
    public final int f28542a;
    public final c1 f28543b;

    public y0(c1 c1Var, int i10) {
        this.f28542a = i10;
        this.f28543b = c1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28542a) {
            case 0:
                super.onAnimationEnd(animator);
                c1 c1Var = this.f28543b;
                if (c1Var.getParent() != null) {
                    ((ViewGroup) c1Var.getParent()).removeView(c1Var);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f28543b;
                if (c1Var2.getParent() != null) {
                    ((ViewGroup) c1Var2.getParent()).removeView(c1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                c1 c1Var3 = this.f28543b;
                if (c1Var3.getParent() != null) {
                    ((ViewGroup) c1Var3.getParent()).removeView(c1Var3);
                    return;
                }
                return;
        }
    }
}
