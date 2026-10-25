package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f28178a;
    public final jf0 f28179b;

    public ff0(jf0 jf0Var, int i10) {
        this.f28178a = i10;
        this.f28179b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28178a) {
            case 0:
                this.f28179b.f29638x = null;
                return;
            default:
                this.f28179b.f29639y = null;
                return;
        }
    }
}
