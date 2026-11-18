package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class i91 extends AnimatorListenerAdapter {
    public final int f48662a;
    public final boolean f48663b;
    public final y91 f48664c;

    public i91(y91 y91Var, boolean z10, int i7) {
        this.f48662a = i7;
        this.f48664c = y91Var;
        this.f48663b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f48662a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f48663b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y91 y91Var = this.f48664c;
                y91Var.W0(f10);
                if (z10) {
                    y91Var.f54088r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = y91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) y91Var).classGuid;
                org.telegram.messenger.g0.k3(parentActivity, i7);
                y91Var.f54091s0.setVisibility(8);
                y91Var.U0(true);
                return;
            default:
                if (!this.f48663b) {
                    this.f48664c.f54083p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
