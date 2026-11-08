package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class h91 extends AnimatorListenerAdapter {
    public final int f46308a;
    public final boolean f46309b;
    public final w91 f46310c;

    public h91(w91 w91Var, boolean z9, int i7) {
        this.f46308a = i7;
        this.f46310c = w91Var;
        this.f46309b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f46308a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z9 = this.f46309b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w91 w91Var = this.f46310c;
                w91Var.W0(f10);
                if (z9) {
                    w91Var.f51027q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = w91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) w91Var).classGuid;
                org.telegram.messenger.g0.l3(parentActivity, i7);
                w91Var.f51029r0.setVisibility(8);
                w91Var.U0(true);
                return;
            default:
                if (!this.f46309b) {
                    this.f46310c.f51023o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
