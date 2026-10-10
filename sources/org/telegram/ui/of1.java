package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class of1 extends AnimatorListenerAdapter {
    public final int f40567a;
    public final boolean f40568b;
    public final fg1 f40569c;

    public of1(fg1 fg1Var, boolean z10, int i10) {
        this.f40567a = i10;
        this.f40569c = fg1Var;
        this.f40568b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40567a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40568b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fg1 fg1Var = this.f40569c;
                fg1Var.S0(f7);
                if (z10) {
                    fg1Var.f37635q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = fg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                fg1Var.f37637r0.setVisibility(8);
                fg1Var.Q0(true);
                return;
            default:
                if (!this.f40568b) {
                    this.f40569c.f37633o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
