package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class of1 extends AnimatorListenerAdapter {
    public final int f36301a;
    public final boolean f36302b;
    public final fg1 f36303c;

    public of1(fg1 fg1Var, boolean z10, int i10) {
        this.f36301a = i10;
        this.f36303c = fg1Var;
        this.f36302b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f36301a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f36302b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fg1 fg1Var = this.f36303c;
                fg1Var.S0(f7);
                if (z10) {
                    fg1Var.f33628q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = fg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                fg1Var.f33630r0.setVisibility(8);
                fg1Var.Q0(true);
                return;
            default:
                if (!this.f36302b) {
                    this.f36303c.f33626o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
