package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f37921a;
    public final boolean f37922b;
    public final we1 f37923c;

    public ee1(we1 we1Var, boolean z10, int i9) {
        this.f37921a = i9;
        this.f37923c = we1Var;
        this.f37922b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i9;
        switch (this.f37921a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f37922b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                we1 we1Var = this.f37923c;
                we1Var.S0(f10);
                if (z10) {
                    we1Var.m0.setVisibility(8);
                    return;
                }
                Activity parentActivity = we1Var.getParentActivity();
                i9 = ((org.telegram.ui.ActionBar.o2) we1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i9);
                we1Var.f43768n0.setVisibility(8);
                we1Var.Q0(true);
                return;
            default:
                if (!this.f37922b) {
                    this.f37923c.f43765k0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
