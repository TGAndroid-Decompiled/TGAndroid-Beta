package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f81 extends AnimatorListenerAdapter {
    public final int f47087a;
    public final g81 f47088b;

    public f81(g81 g81Var, int i7) {
        this.f47087a = i7;
        this.f47088b = g81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47087a) {
            case 0:
                this.f47088b.f47387b.f48902s.setVisibility(8);
                return;
            default:
                this.f47088b.f47387b.f48895a.setVisibility(8);
                return;
        }
    }
}
