package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mx0 extends AnimatorListenerAdapter {
    public final int f28859a;
    public final nx0 f28860b;

    public mx0(nx0 nx0Var, int i10) {
        this.f28859a = i10;
        this.f28860b = nx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28859a) {
            case 0:
                nx0 nx0Var = this.f28860b;
                nx0Var.f29170y = 1.0f;
                nx0Var.invalidate();
                nx0Var.G = null;
                return;
            case 1:
                nx0 nx0Var2 = this.f28860b;
                nx0Var2.m(((Float) nx0Var2.v.getAnimatedValue()).floatValue());
                nx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28860b.F = null;
                return;
        }
    }
}
