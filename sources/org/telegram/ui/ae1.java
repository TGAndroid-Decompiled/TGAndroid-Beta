package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ae1 extends AnimatorListenerAdapter {
    public final int f35349a;
    public final boolean f35350b;
    public final re1 f35351c;

    public ae1(re1 re1Var, boolean z10, int i10) {
        this.f35349a = i10;
        this.f35351c = re1Var;
        this.f35350b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35349a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35350b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                re1 re1Var = this.f35351c;
                re1Var.S0(f7);
                if (z10) {
                    re1Var.f41182q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = re1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) re1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                re1Var.f41184r0.setVisibility(8);
                re1Var.Q0(true);
                return;
            default:
                if (!this.f35350b) {
                    this.f35351c.f41180o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
