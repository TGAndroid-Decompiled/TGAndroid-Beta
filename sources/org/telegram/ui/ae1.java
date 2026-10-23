package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ae1 extends AnimatorListenerAdapter {
    public final int f35362a;
    public final boolean f35363b;
    public final re1 f35364c;

    public ae1(re1 re1Var, boolean z10, int i10) {
        this.f35362a = i10;
        this.f35364c = re1Var;
        this.f35363b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f35362a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f35363b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                re1 re1Var = this.f35364c;
                re1Var.S0(f7);
                if (z10) {
                    re1Var.f41184q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = re1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) re1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                re1Var.f41186r0.setVisibility(8);
                re1Var.Q0(true);
                return;
            default:
                if (!this.f35363b) {
                    this.f35364c.f41182o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
