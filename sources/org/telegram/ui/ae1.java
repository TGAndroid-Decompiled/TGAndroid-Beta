package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ae1 extends AnimatorListenerAdapter {
    public final int f35361a;
    public final boolean f35362b;
    public final re1 f35363c;

    public ae1(re1 re1Var, boolean z10, int i10) {
        this.f35361a = i10;
        this.f35363c = re1Var;
        this.f35362b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35361a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35362b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                re1 re1Var = this.f35363c;
                re1Var.S0(f7);
                if (z10) {
                    re1Var.f41183q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = re1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) re1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                re1Var.f41185r0.setVisibility(8);
                re1Var.Q0(true);
                return;
            default:
                if (!this.f35362b) {
                    this.f35363c.f41181o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
