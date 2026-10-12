package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x91 extends AnimatorListenerAdapter {
    public final int f31223a;
    public final y91 f31224b;

    public x91(y91 y91Var, int i10) {
        this.f31223a = i10;
        this.f31224b = y91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31223a) {
            case 0:
                this.f31224b.f31528y = null;
                return;
            default:
                this.f31224b.f31528y = null;
                return;
        }
    }
}
