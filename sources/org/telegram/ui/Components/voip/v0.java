package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v0 extends AnimatorListenerAdapter {
    public final int f39522a;
    public final z0 f39523b;

    public v0(z0 z0Var, int i7) {
        this.f39522a = i7;
        this.f39523b = z0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39522a) {
            case 0:
                super.onAnimationEnd(animator);
                z0 z0Var = this.f39523b;
                if (z0Var.getParent() != null) {
                    ((ViewGroup) z0Var.getParent()).removeView(z0Var);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f39523b;
                if (z0Var2.getParent() != null) {
                    ((ViewGroup) z0Var2.getParent()).removeView(z0Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                z0 z0Var3 = this.f39523b;
                if (z0Var3.getParent() != null) {
                    ((ViewGroup) z0Var3.getParent()).removeView(z0Var3);
                    return;
                }
                return;
        }
    }
}
