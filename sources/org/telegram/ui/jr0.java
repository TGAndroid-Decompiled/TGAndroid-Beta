package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jr0 extends AnimatorListenerAdapter {
    public final int f49050a;
    public final qr0 f49051b;

    public jr0(qr0 qr0Var, int i7) {
        this.f49050a = i7;
        this.f49051b = qr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49050a) {
            case 0:
                this.f49051b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f49051b.S.setTranslationY(0.0f);
                return;
            default:
                qr0 qr0Var = this.f49051b;
                qr0Var.getClass();
                qr0Var.S.setTranslationY(0.0f);
                qr0Var.q0();
                return;
        }
    }
}
