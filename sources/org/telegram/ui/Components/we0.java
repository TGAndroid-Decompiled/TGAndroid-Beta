package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we0 extends AnimatorListenerAdapter {
    public final int f29989a;
    public final af0 f29990b;

    public we0(af0 af0Var, int i10) {
        this.f29989a = i10;
        this.f29990b = af0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29989a) {
            case 0:
                this.f29990b.f22634x = null;
                return;
            default:
                this.f29990b.f22635y = null;
                return;
        }
    }
}
