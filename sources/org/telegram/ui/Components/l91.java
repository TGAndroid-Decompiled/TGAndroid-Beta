package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l91 extends AnimatorListenerAdapter {
    public final int f25957a;
    public final m91 f25958b;

    public l91(m91 m91Var, int i10) {
        this.f25957a = i10;
        this.f25958b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25957a) {
            case 0:
                this.f25958b.f26353y = null;
                return;
            default:
                this.f25958b.f26353y = null;
                return;
        }
    }
}
