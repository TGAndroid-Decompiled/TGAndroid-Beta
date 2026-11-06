package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc0 extends AnimatorListenerAdapter {
    public final int f40253a;
    public final ad0 f40254b;

    public xc0(ad0 ad0Var, int i7) {
        this.f40253a = i7;
        this.f40254b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40253a) {
            case 0:
                this.f40254b.f31778t1 = null;
                return;
            default:
                this.f40254b.f31779u1 = null;
                return;
        }
    }
}
