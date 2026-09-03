package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bf1 extends AnimatorListenerAdapter {
    public final int f35522a;
    public final boolean f35523b;
    public final sf1 f35524c;

    public bf1(sf1 sf1Var, boolean z4, int i10) {
        this.f35522a = i10;
        this.f35524c = sf1Var;
        this.f35523b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f35522a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.f35523b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sf1 sf1Var = this.f35524c;
                sf1Var.S0(f10);
                if (z4) {
                    sf1Var.f41216n0.setVisibility(8);
                    return;
                }
                Activity parentActivity = sf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                sf1Var.f41217o0.setVisibility(8);
                sf1Var.Q0(true);
                return;
            default:
                if (!this.f35523b) {
                    this.f35524c.f41214l0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
