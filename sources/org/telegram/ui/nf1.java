package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class nf1 extends AnimatorListenerAdapter {
    public final int f38945a;
    public final boolean f38946b;
    public final eg1 f38947c;

    public nf1(eg1 eg1Var, boolean z10, int i10) {
        this.f38945a = i10;
        this.f38947c = eg1Var;
        this.f38946b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f38945a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f38946b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                eg1 eg1Var = this.f38947c;
                eg1Var.S0(f7);
                if (z10) {
                    eg1Var.f36058q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = eg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                eg1Var.f36060r0.setVisibility(8);
                eg1Var.Q0(true);
                return;
            default:
                if (!this.f38946b) {
                    this.f38947c.f36056o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
