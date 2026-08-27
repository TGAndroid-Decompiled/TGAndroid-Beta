package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class g3 extends AnimatorListenerAdapter {

    public final int f33585a;

    public final i3 f33586b;

    public g3(i3 i3Var, int i10) {
        this.f33585a = i10;
        this.f33586b = i3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33585a) {
            case 0:
                i3 i3Var = this.f33586b;
                i3Var.f33622r = 0;
                i3Var.invalidate();
                break;
            default:
                i3 i3Var2 = this.f33586b;
                i3Var2.f33623s = 0;
                i3Var2.invalidate();
                break;
        }
    }
}
