package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class of1 extends AnimatorListenerAdapter {
    public final int f36334a;
    public final boolean f36335b;
    public final fg1 f36336c;

    public of1(fg1 fg1Var, boolean z10, int i10) {
        this.f36334a = i10;
        this.f36336c = fg1Var;
        this.f36335b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f36334a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f36335b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fg1 fg1Var = this.f36336c;
                fg1Var.S0(f7);
                if (z10) {
                    fg1Var.f33668q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = fg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                fg1Var.f33670r0.setVisibility(8);
                fg1Var.Q0(true);
                return;
            default:
                if (!this.f36335b) {
                    this.f36336c.f33666o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
