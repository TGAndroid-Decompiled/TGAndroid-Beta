package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i81 extends AnimatorListenerAdapter {
    public final int f46520a;
    public final j81 f46521b;

    public i81(j81 j81Var, int i7) {
        this.f46520a = i7;
        this.f46521b = j81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46520a) {
            case 0:
                this.f46521b.f46883b.f48406s.setVisibility(8);
                return;
            default:
                this.f46521b.f46883b.f48399a.setVisibility(8);
                return;
        }
    }
}
