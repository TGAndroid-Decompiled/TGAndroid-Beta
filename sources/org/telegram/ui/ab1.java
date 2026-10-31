package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class ab1 extends AnimatorListenerAdapter {
    public final int f35615a;
    public final boolean f35616b;
    public final pb1 f35617c;

    public ab1(pb1 pb1Var, boolean z10, int i10) {
        this.f35615a = i10;
        this.f35617c = pb1Var;
        this.f35616b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35615a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35616b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                pb1 pb1Var = this.f35617c;
                pb1Var.V0(f7);
                if (z10) {
                    pb1Var.f40601q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = pb1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).classGuid;
                org.telegram.messenger.i0.k3(parentActivity, i10);
                pb1Var.f40603r0.setVisibility(8);
                pb1Var.T0(true);
                return;
            default:
                if (!this.f35616b) {
                    this.f35617c.f40597o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
