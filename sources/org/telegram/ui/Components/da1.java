package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class da1 extends AnimatorListenerAdapter {
    public final int f25517a;
    public final ea1 f25518b;

    public da1(ea1 ea1Var, int i10) {
        this.f25517a = i10;
        this.f25518b = ea1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25517a) {
            case 0:
                this.f25518b.f25952y = null;
                return;
            default:
                this.f25518b.f25952y = null;
                return;
        }
    }
}
