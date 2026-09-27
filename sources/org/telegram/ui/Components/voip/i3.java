package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f29341a;
    public final k3 f29342b;

    public i3(k3 k3Var, int i10) {
        this.f29341a = i10;
        this.f29342b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29341a) {
            case 0:
                k3 k3Var = this.f29342b;
                k3Var.f29381r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f29342b;
                k3Var2.f29382s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
