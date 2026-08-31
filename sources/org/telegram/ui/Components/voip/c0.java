package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31985a;
    public final l0 f31986b;

    public c0(l0 l0Var, int i10) {
        this.f31985a = i10;
        this.f31986b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31985a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31986b;
                l0Var.G0 = null;
                l0Var.F0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31986b;
                l0Var2.f32172y0 = null;
                l0Var2.f32166v0 = 1.0f;
                l0Var2.f32157o0 = 0.0f;
                l0Var2.f32158p0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
