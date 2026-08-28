package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f27904a;
    public final j20 f27905b;

    public e20(j20 j20Var, int i9) {
        this.f27904a = i9;
        this.f27905b = j20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27904a) {
            case 0:
                j20 j20Var = this.f27905b;
                j20Var.f29599b.setVisibility(8);
                j20Var.f29608y = false;
                j20Var.A = 0.0f;
                return;
            default:
                this.f27905b.f29601e.setVisibility(8);
                return;
        }
    }
}
