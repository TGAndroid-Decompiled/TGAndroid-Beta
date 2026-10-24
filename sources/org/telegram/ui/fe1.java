package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class fe1 extends AnimatorListenerAdapter {
    public final int f37319a;
    public final boolean f37320b;
    public final xe1 f37321c;

    public fe1(xe1 xe1Var, boolean z10, int i10) {
        this.f37319a = i10;
        this.f37321c = xe1Var;
        this.f37320b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f37319a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f37320b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                xe1 xe1Var = this.f37321c;
                xe1Var.R0(f7);
                if (z10) {
                    xe1Var.f43580q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = xe1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) xe1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                xe1Var.f43582r0.setVisibility(8);
                xe1Var.P0(true);
                return;
            default:
                if (!this.f37320b) {
                    this.f37321c.f43576o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
