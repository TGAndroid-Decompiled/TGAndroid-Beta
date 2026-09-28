package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l91 extends AnimatorListenerAdapter {
    public final int f25958a;
    public final m91 f25959b;

    public l91(m91 m91Var, int i10) {
        this.f25958a = i10;
        this.f25959b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25958a) {
            case 0:
                this.f25959b.f26354y = null;
                return;
            default:
                this.f25959b.f26354y = null;
                return;
        }
    }
}
