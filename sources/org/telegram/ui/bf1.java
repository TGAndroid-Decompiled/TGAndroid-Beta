package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class bf1 extends AnimatorListenerAdapter {
    public final int f32873a;
    public final boolean f32874b;
    public final sf1 f32875c;

    public bf1(sf1 sf1Var, boolean z4, int i10) {
        this.f32873a = i10;
        this.f32875c = sf1Var;
        this.f32874b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f32873a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.f32874b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sf1 sf1Var = this.f32875c;
                sf1Var.S0(f10);
                if (z4) {
                    sf1Var.f38202n0.setVisibility(8);
                    return;
                }
                Activity parentActivity = sf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                sf1Var.f38203o0.setVisibility(8);
                sf1Var.Q0(true);
                return;
            default:
                if (!this.f32874b) {
                    this.f32875c.f38200l0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
