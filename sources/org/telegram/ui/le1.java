package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class le1 extends AnimatorListenerAdapter {
    public final int f41102a;
    public final boolean f41103b;
    public final cf1 f41104c;

    public le1(cf1 cf1Var, boolean z10, int i10) {
        this.f41102a = i10;
        this.f41104c = cf1Var;
        this.f41103b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f41102a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f41103b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                cf1 cf1Var = this.f41104c;
                cf1Var.S0(f7);
                if (z10) {
                    cf1Var.f38323q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = cf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                cf1Var.f38325r0.setVisibility(8);
                cf1Var.Q0(true);
                return;
            default:
                if (!this.f41103b) {
                    this.f41104c.f38319o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
