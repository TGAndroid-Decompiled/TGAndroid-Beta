package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class a1 extends AnimatorListenerAdapter {
    public final int f31585a;
    public final e1 f31586b;

    public a1(e1 e1Var, int i10) {
        this.f31585a = i10;
        this.f31586b = e1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31585a) {
            case 0:
                super.onAnimationEnd(animator);
                e1 e1Var = this.f31586b;
                if (e1Var.getParent() != null) {
                    ((ViewGroup) e1Var.getParent()).removeView(e1Var);
                    return;
                }
                return;
            case 1:
                e1 e1Var2 = this.f31586b;
                if (e1Var2.getParent() != null) {
                    ((ViewGroup) e1Var2.getParent()).removeView(e1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                e1 e1Var3 = this.f31586b;
                if (e1Var3.getParent() != null) {
                    ((ViewGroup) e1Var3.getParent()).removeView(e1Var3);
                    return;
                }
                return;
        }
    }
}
