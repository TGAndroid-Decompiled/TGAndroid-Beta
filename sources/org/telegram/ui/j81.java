package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f48940a;
    public final k81 f48941b;

    public j81(k81 k81Var, int i7) {
        this.f48940a = i7;
        this.f48941b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48940a) {
            case 0:
                this.f48941b.f49204b.f50789s.setVisibility(8);
                return;
            default:
                this.f48941b.f49204b.f50782a.setVisibility(8);
                return;
        }
    }
}
