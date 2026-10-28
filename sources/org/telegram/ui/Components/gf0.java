package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gf0 extends AnimatorListenerAdapter {
    public final int f28574a;
    public final kf0 f28575b;

    public gf0(kf0 kf0Var, int i10) {
        this.f28574a = i10;
        this.f28575b = kf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28574a) {
            case 0:
                this.f28575b.f29951x = null;
                return;
            default:
                this.f28575b.f29952y = null;
                return;
        }
    }
}
