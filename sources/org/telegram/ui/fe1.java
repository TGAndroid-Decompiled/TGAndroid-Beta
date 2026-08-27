package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class fe1 extends AnimatorListenerAdapter {

    public final int f38110a;

    public final boolean f38111b;

    public final we1 f38112c;

    public fe1(we1 we1Var, boolean z10, int i10) {
        this.f38110a = i10;
        this.f38112c = we1Var;
        this.f38111b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38110a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f38111b;
                float f10 = z10 ? 1.0f : 0.0f;
                we1 we1Var = this.f38112c;
                we1Var.S0(f10);
                if (!z10) {
                    AndroidUtilities.setAdjustResizeToNothing(we1Var.getParentActivity(), ((org.telegram.ui.ActionBar.n2) we1Var).classGuid);
                    we1Var.f43746n0.setVisibility(8);
                    we1Var.Q0(true);
                } else {
                    we1Var.m0.setVisibility(8);
                }
                break;
            default:
                if (!this.f38111b) {
                    this.f38112c.f43743k0.setVisibility(8);
                }
                break;
        }
    }
}
