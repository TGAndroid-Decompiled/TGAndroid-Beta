package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class by0 extends AnimatorListenerAdapter {
    public final int f27304a;
    public final Switch f27305b;

    public by0(Switch r12, int i9) {
        this.f27304a = i9;
        this.f27305b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27304a) {
            case 0:
                this.f27305b.d = null;
                return;
            default:
                this.f27305b.f26545e = null;
                return;
        }
    }
}
