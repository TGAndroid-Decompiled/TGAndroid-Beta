package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ha1 extends AnimatorListenerAdapter {
    public final int f26728a;
    public final ia1 f26729b;

    public ha1(ia1 ia1Var, int i10) {
        this.f26728a = i10;
        this.f26729b = ia1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26728a) {
            case 0:
                this.f26729b.f27133y = null;
                return;
            default:
                this.f26729b.f27133y = null;
                return;
        }
    }
}
