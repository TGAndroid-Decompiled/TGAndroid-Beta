package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27246a;
    public final jg0 f27247b;

    public ig0(jg0 jg0Var, int i10) {
        this.f27246a = i10;
        this.f27247b = jg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27246a) {
            case 0:
                this.f27247b.f27526a.f27847n.setVisibility(8);
                return;
            default:
                this.f27247b.f27526a.h.setVisibility(8);
                return;
        }
    }
}
