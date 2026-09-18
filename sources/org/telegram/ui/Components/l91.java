package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l91 extends AnimatorListenerAdapter {
    public final int f26086a;
    public final m91 f26087b;

    public l91(m91 m91Var, int i10) {
        this.f26086a = i10;
        this.f26087b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26086a) {
            case 0:
                this.f26087b.f26388y = null;
                return;
            default:
                this.f26087b.f26388y = null;
                return;
        }
    }
}
