package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x81 extends AnimatorListenerAdapter {
    public final int f29905a;
    public final y81 f29906b;

    public x81(y81 y81Var, int i10) {
        this.f29905a = i10;
        this.f29906b = y81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29905a) {
            case 0:
                this.f29906b.f30186y = null;
                return;
            default:
                this.f29906b.f30186y = null;
                return;
        }
    }
}
