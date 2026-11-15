package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class e91 extends AnimatorListenerAdapter {
    public final int f46654a;
    public final boolean f46655b;
    public final u91 f46656c;

    public e91(u91 u91Var, boolean z10, int i7) {
        this.f46654a = i7;
        this.f46656c = u91Var;
        this.f46655b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f46654a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f46655b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u91 u91Var = this.f46656c;
                u91Var.W0(f10);
                if (z10) {
                    u91Var.f51872r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = u91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) u91Var).classGuid;
                org.telegram.messenger.g0.l3(parentActivity, i7);
                u91Var.f51874s0.setVisibility(8);
                u91Var.U0(true);
                return;
            default:
                if (!this.f46655b) {
                    this.f46656c.f51867p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
