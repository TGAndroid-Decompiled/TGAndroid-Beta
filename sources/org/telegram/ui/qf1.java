package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qf1 extends AnimatorListenerAdapter {
    public final int f41320a;
    public final boolean f41321b;
    public final hg1 f41322c;

    public qf1(hg1 hg1Var, boolean z10, int i10) {
        this.f41320a = i10;
        this.f41322c = hg1Var;
        this.f41321b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f41320a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f41321b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                hg1 hg1Var = this.f41322c;
                hg1Var.S0(f7);
                if (z10) {
                    hg1Var.f38409q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = hg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) hg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                hg1Var.f38411r0.setVisibility(8);
                hg1Var.Q0(true);
                return;
            default:
                if (!this.f41321b) {
                    this.f41322c.f38407o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
