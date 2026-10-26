package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class je1 extends AnimatorListenerAdapter {
    public final int f40585a;
    public final boolean f40586b;
    public final af1 f40587c;

    public je1(af1 af1Var, boolean z10, int i10) {
        this.f40585a = i10;
        this.f40587c = af1Var;
        this.f40586b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40585a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40586b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                af1 af1Var = this.f40587c;
                af1Var.S0(f7);
                if (z10) {
                    af1Var.f37769q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = af1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) af1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                af1Var.f37771r0.setVisibility(8);
                af1Var.Q0(true);
                return;
            default:
                if (!this.f40586b) {
                    this.f40587c.f37765o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
