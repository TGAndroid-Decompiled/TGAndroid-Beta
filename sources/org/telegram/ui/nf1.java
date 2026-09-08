package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class nf1 extends AnimatorListenerAdapter {
    public final int f38972a;
    public final boolean f38973b;
    public final eg1 f38974c;

    public nf1(eg1 eg1Var, boolean z10, int i10) {
        this.f38972a = i10;
        this.f38974c = eg1Var;
        this.f38973b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f38972a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f38973b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                eg1 eg1Var = this.f38974c;
                eg1Var.S0(f7);
                if (z10) {
                    eg1Var.f36085q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = eg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                eg1Var.f36087r0.setVisibility(8);
                eg1Var.Q0(true);
                return;
            default:
                if (!this.f38973b) {
                    this.f38974c.f36083o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
