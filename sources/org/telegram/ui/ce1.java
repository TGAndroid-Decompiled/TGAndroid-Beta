package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ce1 extends AnimatorListenerAdapter {
    public final int f35940a;
    public final boolean f35941b;
    public final te1 f35942c;

    public ce1(te1 te1Var, boolean z10, int i10) {
        this.f35940a = i10;
        this.f35942c = te1Var;
        this.f35941b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35940a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35941b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                te1 te1Var = this.f35942c;
                te1Var.S0(f7);
                if (z10) {
                    te1Var.f41737q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = te1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) te1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                te1Var.f41739r0.setVisibility(8);
                te1Var.Q0(true);
                return;
            default:
                if (!this.f35941b) {
                    this.f35942c.f41735o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
