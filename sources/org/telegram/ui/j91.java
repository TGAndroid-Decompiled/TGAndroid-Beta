package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class j91 extends AnimatorListenerAdapter {
    public final int f46879a;
    public final boolean f46880b;
    public final z91 f46881c;

    public j91(z91 z91Var, boolean z9, int i7) {
        this.f46879a = i7;
        this.f46881c = z91Var;
        this.f46880b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f46879a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z9 = this.f46880b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z91 z91Var = this.f46881c;
                z91Var.W0(f10);
                if (z9) {
                    z91Var.f52378q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = z91Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) z91Var).classGuid;
                org.telegram.messenger.g0.l3(parentActivity, i7);
                z91Var.f52380r0.setVisibility(8);
                z91Var.U0(true);
                return;
            default:
                if (!this.f46880b) {
                    this.f46881c.f52374o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
