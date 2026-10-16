package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g3 extends AnimatorListenerAdapter {
    public final int f29860a;
    public final i3 f29861b;

    public g3(i3 i3Var, int i10) {
        this.f29860a = i10;
        this.f29861b = i3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29860a) {
            case 0:
                i3 i3Var = this.f29861b;
                i3Var.f29904r = 0;
                i3Var.invalidate();
                return;
            default:
                i3 i3Var2 = this.f29861b;
                i3Var2.f29905s = 0;
                i3Var2.invalidate();
                return;
        }
    }
}
