package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class nf1 extends AnimatorListenerAdapter {
    public final int f40276a;
    public final boolean f40277b;
    public final eg1 f40278c;

    public nf1(eg1 eg1Var, boolean z10, int i10) {
        this.f40276a = i10;
        this.f40278c = eg1Var;
        this.f40277b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40276a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40277b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                eg1 eg1Var = this.f40278c;
                eg1Var.S0(f7);
                if (z10) {
                    eg1Var.f37378q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = eg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) eg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                eg1Var.f37380r0.setVisibility(8);
                eg1Var.Q0(true);
                return;
            default:
                if (!this.f40277b) {
                    this.f40278c.f37376o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
