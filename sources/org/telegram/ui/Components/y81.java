package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y81 extends AnimatorListenerAdapter {
    public final int f30145a;
    public final z81 f30146b;

    public y81(z81 z81Var, int i10) {
        this.f30145a = i10;
        this.f30146b = z81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30145a) {
            case 0:
                this.f30146b.f30426y = null;
                return;
            default:
                this.f30146b.f30426y = null;
                return;
        }
    }
}
