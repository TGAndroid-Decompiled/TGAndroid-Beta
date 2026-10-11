package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f32036a;
    public final k3 f32037b;

    public i3(k3 k3Var, int i10) {
        this.f32036a = i10;
        this.f32037b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32036a) {
            case 0:
                k3 k3Var = this.f32037b;
                k3Var.f32076r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f32037b;
                k3Var2.f32077s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
