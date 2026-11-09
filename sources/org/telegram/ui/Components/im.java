package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class im extends AnimatorListenerAdapter {
    public final int f34806a;
    public final bn f34807b;

    public im(bn bnVar, int i7) {
        this.f34806a = i7;
        this.f34807b = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34806a) {
            case 0:
                this.f34807b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f34807b.E.setTranslationY(0.0f);
                return;
            default:
                bn bnVar = this.f34807b;
                bnVar.f32296f1 = false;
                bnVar.E.setTranslationY(0.0f);
                bnVar.f0();
                return;
        }
    }
}
