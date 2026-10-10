package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f32042a;
    public final j3 f32043b;

    public h3(j3 j3Var, int i10) {
        this.f32042a = i10;
        this.f32043b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32042a) {
            case 0:
                j3 j3Var = this.f32043b;
                j3Var.f32082r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f32043b;
                j3Var2.f32083s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
