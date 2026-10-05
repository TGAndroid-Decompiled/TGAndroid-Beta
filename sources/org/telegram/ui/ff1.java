package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ff1 extends AnimatorListenerAdapter {
    public final int f36302a;
    public final boolean f36303b;
    public final wf1 f36304c;

    public ff1(wf1 wf1Var, boolean z10, int i10) {
        this.f36302a = i10;
        this.f36304c = wf1Var;
        this.f36303b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f36302a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f36303b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wf1 wf1Var = this.f36304c;
                wf1Var.S0(f7);
                if (z10) {
                    wf1Var.f42500q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = wf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                wf1Var.f42502r0.setVisibility(8);
                wf1Var.Q0(true);
                return;
            default:
                if (!this.f36303b) {
                    this.f36304c.f42498o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
