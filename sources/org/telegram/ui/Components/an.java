package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final int f22695a;
    public final wn f22696b;

    public an(wn wnVar, int i10) {
        this.f22695a = i10;
        this.f22696b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22695a) {
            case 0:
                this.f22696b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f22696b.E.setTranslationY(0.0f);
                return;
            default:
                wn wnVar = this.f22696b;
                wnVar.f30118f1 = false;
                wnVar.E.setTranslationY(0.0f);
                wnVar.a0();
                return;
        }
    }
}
