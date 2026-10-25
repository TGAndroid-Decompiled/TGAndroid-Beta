package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f33859a;
    public final k3 f33860b;

    public i3(k3 k3Var, int i10) {
        this.f33859a = i10;
        this.f33860b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33859a) {
            case 0:
                k3 k3Var = this.f33860b;
                k3Var.f33889r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f33860b;
                k3Var2.f33890s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
