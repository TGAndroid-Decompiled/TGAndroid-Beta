package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q91 extends AnimatorListenerAdapter {
    public final int f29570a;
    public final r91 f29571b;

    public q91(r91 r91Var, int i10) {
        this.f29570a = i10;
        this.f29571b = r91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29570a) {
            case 0:
                this.f29571b.f29911y = null;
                return;
            default:
                this.f29571b.f29911y = null;
                return;
        }
    }
}
