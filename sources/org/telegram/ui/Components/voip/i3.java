package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f32099a;
    public final k3 f32100b;

    public i3(k3 k3Var, int i10) {
        this.f32099a = i10;
        this.f32100b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32099a) {
            case 0:
                k3 k3Var = this.f32100b;
                k3Var.f32128r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f32100b;
                k3Var2.f32129s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
