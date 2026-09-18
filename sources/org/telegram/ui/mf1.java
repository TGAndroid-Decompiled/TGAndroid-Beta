package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class mf1 extends AnimatorListenerAdapter {
    public final int f35657a;
    public final boolean f35658b;
    public final dg1 f35659c;

    public mf1(dg1 dg1Var, boolean z10, int i10) {
        this.f35657a = i10;
        this.f35659c = dg1Var;
        this.f35658b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35657a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35658b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                dg1 dg1Var = this.f35659c;
                dg1Var.S0(f7);
                if (z10) {
                    dg1Var.f33002q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = dg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                dg1Var.f33004r0.setVisibility(8);
                dg1Var.Q0(true);
                return;
            default:
                if (!this.f35658b) {
                    this.f35659c.f33000o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
