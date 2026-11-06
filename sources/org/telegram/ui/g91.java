package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class g91 extends AnimatorListenerAdapter {
    public final int f45925a;
    public final boolean f45926b;
    public final v91 f45927c;

    public g91(v91 v91Var, boolean z9, int i7) {
        this.f45925a = i7;
        this.f45927c = v91Var;
        this.f45926b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f45925a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z9 = this.f45926b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v91 v91Var = this.f45927c;
                v91Var.W0(f10);
                if (z9) {
                    v91Var.f50664q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = v91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) v91Var).classGuid;
                org.telegram.messenger.g0.l3(parentActivity, i7);
                v91Var.f50666r0.setVisibility(8);
                v91Var.U0(true);
                return;
            default:
                if (!this.f45926b) {
                    this.f45927c.f50660o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
