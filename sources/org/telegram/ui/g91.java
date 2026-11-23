package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class g91 extends AnimatorListenerAdapter {
    public final int f48191a;
    public final boolean f48192b;
    public final w91 f48193c;

    public g91(w91 w91Var, boolean z10, int i7) {
        this.f48191a = i7;
        this.f48193c = w91Var;
        this.f48192b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f48191a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f48192b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w91 w91Var = this.f48193c;
                w91Var.W0(f10);
                if (z10) {
                    w91Var.f53254r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = w91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) w91Var).classGuid;
                org.telegram.messenger.g0.k3(parentActivity, i7);
                w91Var.f53257s0.setVisibility(8);
                w91Var.U0(true);
                return;
            default:
                if (!this.f48192b) {
                    this.f48193c.f53249p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
