package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class hf1 extends AnimatorListenerAdapter {
    public final int f37062a;
    public final boolean f37063b;
    public final yf1 f37064c;

    public hf1(yf1 yf1Var, boolean z10, int i10) {
        this.f37062a = i10;
        this.f37064c = yf1Var;
        this.f37063b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f37062a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f37063b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                yf1 yf1Var = this.f37064c;
                yf1Var.S0(f7);
                if (z10) {
                    yf1Var.f43196q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = yf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                yf1Var.f43198r0.setVisibility(8);
                yf1Var.Q0(true);
                return;
            default:
                if (!this.f37063b) {
                    this.f37064c.f43194o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
