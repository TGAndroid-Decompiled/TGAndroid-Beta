package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class of1 extends AnimatorListenerAdapter {
    public final int f36339a;
    public final boolean f36340b;
    public final fg1 f36341c;

    public of1(fg1 fg1Var, boolean z10, int i10) {
        this.f36339a = i10;
        this.f36341c = fg1Var;
        this.f36340b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f36339a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f36340b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fg1 fg1Var = this.f36341c;
                fg1Var.S0(f7);
                if (z10) {
                    fg1Var.f33672q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = fg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                fg1Var.f33674r0.setVisibility(8);
                fg1Var.Q0(true);
                return;
            default:
                if (!this.f36340b) {
                    this.f36341c.f33670o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
