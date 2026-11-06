package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class im extends AnimatorListenerAdapter {
    public final int f34735a;
    public final bn f34736b;

    public im(bn bnVar, int i7) {
        this.f34735a = i7;
        this.f34736b = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34735a) {
            case 0:
                this.f34736b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f34736b.E.setTranslationY(0.0f);
                return;
            default:
                bn bnVar = this.f34736b;
                bnVar.f32188f1 = false;
                bnVar.E.setTranslationY(0.0f);
                bnVar.f0();
                return;
        }
    }
}
