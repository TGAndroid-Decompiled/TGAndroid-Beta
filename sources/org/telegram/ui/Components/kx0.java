package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kx0 extends AnimatorListenerAdapter {
    public final int f25836a;
    public final lx0 f25837b;

    public kx0(lx0 lx0Var, int i10) {
        this.f25836a = i10;
        this.f25837b = lx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25836a) {
            case 0:
                this.f25837b.f26149s.setVisibility(8);
                return;
            case 1:
                this.f25837b.f26149s.setVisibility(8);
                return;
            default:
                this.f25837b.f26149s.setVisibility(8);
                return;
        }
    }
}
