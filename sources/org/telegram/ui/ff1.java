package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ff1 extends AnimatorListenerAdapter {
    public final int f33306a;
    public final boolean f33307b;
    public final wf1 f33308c;

    public ff1(wf1 wf1Var, boolean z10, int i10) {
        this.f33306a = i10;
        this.f33308c = wf1Var;
        this.f33307b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f33306a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f33307b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wf1 wf1Var = this.f33308c;
                wf1Var.S0(f7);
                if (z10) {
                    wf1Var.f38968q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = wf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                wf1Var.f38970r0.setVisibility(8);
                wf1Var.Q0(true);
                return;
            default:
                if (!this.f33307b) {
                    this.f33308c.f38966o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
