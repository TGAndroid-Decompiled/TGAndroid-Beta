package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f32104a;
    public final k3 f32105b;

    public i3(k3 k3Var, int i10) {
        this.f32104a = i10;
        this.f32105b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32104a) {
            case 0:
                k3 k3Var = this.f32105b;
                k3Var.f32133r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f32105b;
                k3Var2.f32134s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
