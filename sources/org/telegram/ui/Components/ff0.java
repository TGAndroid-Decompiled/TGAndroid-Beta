package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f28180a;
    public final jf0 f28181b;

    public ff0(jf0 jf0Var, int i10) {
        this.f28180a = i10;
        this.f28181b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28180a) {
            case 0:
                this.f28181b.f29640x = null;
                return;
            default:
                this.f28181b.f29641y = null;
                return;
        }
    }
}
