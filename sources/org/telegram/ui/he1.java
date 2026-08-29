package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class he1 extends AnimatorListenerAdapter {
    public final int f38887a;
    public final boolean f38888b;
    public final ze1 f38889c;

    public he1(ze1 ze1Var, boolean z10, int i10) {
        this.f38887a = i10;
        this.f38889c = ze1Var;
        this.f38888b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        int i10;
        switch (this.f38887a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f38888b;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ze1 ze1Var = this.f38889c;
                ze1Var.S0(f9);
                if (z10) {
                    ze1Var.m0.setVisibility(8);
                    return;
                }
                Activity parentActivity = ze1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                ze1Var.f45182n0.setVisibility(8);
                ze1Var.Q0(true);
                return;
            default:
                if (!this.f38888b) {
                    this.f38889c.f45179k0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
