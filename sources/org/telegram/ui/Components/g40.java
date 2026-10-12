package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g40 extends AnimatorListenerAdapter {
    public final int f25178a;
    public final i40 f25179b;

    public g40(i40 i40Var, int i10) {
        this.f25178a = i10;
        this.f25179b = i40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25178a) {
            case 0:
                i40 i40Var = this.f25179b;
                if (i40Var.f25816b0 == animator) {
                    i40Var.f25816b0 = null;
                    i40Var.b();
                    return;
                }
                return;
            default:
                i40 i40Var2 = this.f25179b;
                if (i40Var2.f25814a0 == animator) {
                    i40Var2.f25814a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25178a) {
            case 1:
                h40 h40Var = this.f25179b.W;
                if (h40Var != null) {
                    ((org.telegram.ui.ct0) h40Var).f35071a.f32226e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
