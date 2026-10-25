package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class je1 extends AnimatorListenerAdapter {
    public final int f40582a;
    public final boolean f40583b;
    public final af1 f40584c;

    public je1(af1 af1Var, boolean z10, int i10) {
        this.f40582a = i10;
        this.f40584c = af1Var;
        this.f40583b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40582a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40583b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                af1 af1Var = this.f40584c;
                af1Var.S0(f7);
                if (z10) {
                    af1Var.f37766q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = af1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) af1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                af1Var.f37768r0.setVisibility(8);
                af1Var.Q0(true);
                return;
            default:
                if (!this.f40583b) {
                    this.f40584c.f37762o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
