package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ce1 extends AnimatorListenerAdapter {
    public final int f35927a;
    public final boolean f35928b;
    public final te1 f35929c;

    public ce1(te1 te1Var, boolean z10, int i10) {
        this.f35927a = i10;
        this.f35929c = te1Var;
        this.f35928b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35927a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35928b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                te1 te1Var = this.f35929c;
                te1Var.S0(f7);
                if (z10) {
                    te1Var.f41711q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = te1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) te1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                te1Var.f41713r0.setVisibility(8);
                te1Var.Q0(true);
                return;
            default:
                if (!this.f35928b) {
                    this.f35929c.f41709o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
