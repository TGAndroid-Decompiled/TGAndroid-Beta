package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w0 extends AnimatorListenerAdapter {
    public final int f29980a;
    public final a1 f29981b;

    public w0(a1 a1Var, int i10) {
        this.f29980a = i10;
        this.f29981b = a1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29980a) {
            case 0:
                super.onAnimationEnd(animator);
                a1 a1Var = this.f29981b;
                if (a1Var.getParent() != null) {
                    ((ViewGroup) a1Var.getParent()).removeView(a1Var);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f29981b;
                if (a1Var2.getParent() != null) {
                    ((ViewGroup) a1Var2.getParent()).removeView(a1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                a1 a1Var3 = this.f29981b;
                if (a1Var3.getParent() != null) {
                    ((ViewGroup) a1Var3.getParent()).removeView(a1Var3);
                    return;
                }
                return;
        }
    }
}
