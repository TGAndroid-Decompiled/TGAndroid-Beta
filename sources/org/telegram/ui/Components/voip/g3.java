package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g3 extends AnimatorListenerAdapter {
    public final int f30191a;
    public final i3 f30192b;

    public g3(i3 i3Var, int i10) {
        this.f30191a = i10;
        this.f30192b = i3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30191a) {
            case 0:
                i3 i3Var = this.f30192b;
                i3Var.f30235r = 0;
                i3Var.invalidate();
                return;
            default:
                i3 i3Var2 = this.f30192b;
                i3Var2.f30236s = 0;
                i3Var2.invalidate();
                return;
        }
    }
}
