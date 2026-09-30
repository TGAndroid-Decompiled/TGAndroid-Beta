package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ff1 extends AnimatorListenerAdapter {
    public final int f33751a;
    public final boolean f33752b;
    public final wf1 f33753c;

    public ff1(wf1 wf1Var, boolean z10, int i10) {
        this.f33751a = i10;
        this.f33753c = wf1Var;
        this.f33752b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f33751a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f33752b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wf1 wf1Var = this.f33753c;
                wf1Var.S0(f7);
                if (z10) {
                    wf1Var.f39429q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = wf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                wf1Var.f39431r0.setVisibility(8);
                wf1Var.Q0(true);
                return;
            default:
                if (!this.f33752b) {
                    this.f33753c.f39427o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
