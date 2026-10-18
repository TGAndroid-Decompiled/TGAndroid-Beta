package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ce1 extends AnimatorListenerAdapter {
    public final int f35894a;
    public final boolean f35895b;
    public final te1 f35896c;

    public ce1(te1 te1Var, boolean z10, int i10) {
        this.f35894a = i10;
        this.f35896c = te1Var;
        this.f35895b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35894a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35895b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                te1 te1Var = this.f35896c;
                te1Var.S0(f7);
                if (z10) {
                    te1Var.f41702q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = te1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) te1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                te1Var.f41704r0.setVisibility(8);
                te1Var.Q0(true);
                return;
            default:
                if (!this.f35895b) {
                    this.f35896c.f41700o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
