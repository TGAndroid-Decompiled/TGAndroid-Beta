package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ge1 extends AnimatorListenerAdapter {
    public final int f37587a;
    public final boolean f37588b;
    public final ye1 f37589c;

    public ge1(ye1 ye1Var, boolean z10, int i10) {
        this.f37587a = i10;
        this.f37589c = ye1Var;
        this.f37588b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f37587a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f37588b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ye1 ye1Var = this.f37589c;
                ye1Var.R0(f7);
                if (z10) {
                    ye1Var.f43827q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = ye1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                ye1Var.f43829r0.setVisibility(8);
                ye1Var.P0(true);
                return;
            default:
                if (!this.f37588b) {
                    this.f37589c.f43823o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
