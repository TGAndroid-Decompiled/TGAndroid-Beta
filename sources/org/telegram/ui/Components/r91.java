package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r91 extends AnimatorListenerAdapter {
    public final int f29910a;
    public final s91 f29911b;

    public r91(s91 s91Var, int i10) {
        this.f29910a = i10;
        this.f29911b = s91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29910a) {
            case 0:
                this.f29911b.f30236y = null;
                return;
            default:
                this.f29911b.f30236y = null;
                return;
        }
    }
}
