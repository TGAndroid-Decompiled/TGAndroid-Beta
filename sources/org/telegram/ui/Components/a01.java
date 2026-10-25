package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a01 extends AnimatorListenerAdapter {
    public final int f26373a;
    public final Switch f26374b;

    public a01(Switch r12, int i10) {
        this.f26373a = i10;
        this.f26374b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26373a) {
            case 0:
                this.f26374b.d = null;
                return;
            default:
                this.f26374b.e = null;
                return;
        }
    }
}
