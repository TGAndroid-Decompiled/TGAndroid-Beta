package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class y0 extends AnimatorListenerAdapter {
    public final int f41361a;
    public final c1 f41362b;

    public y0(c1 c1Var, int i7) {
        this.f41361a = i7;
        this.f41362b = c1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41361a) {
            case 0:
                super.onAnimationEnd(animator);
                c1 c1Var = this.f41362b;
                if (c1Var.getParent() != null) {
                    ((ViewGroup) c1Var.getParent()).removeView(c1Var);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f41362b;
                if (c1Var2.getParent() != null) {
                    ((ViewGroup) c1Var2.getParent()).removeView(c1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                c1 c1Var3 = this.f41362b;
                if (c1Var3.getParent() != null) {
                    ((ViewGroup) c1Var3.getParent()).removeView(c1Var3);
                    return;
                }
                return;
        }
    }
}
