package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final int f22694a;
    public final wn f22695b;

    public an(wn wnVar, int i10) {
        this.f22694a = i10;
        this.f22695b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22694a) {
            case 0:
                this.f22695b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f22695b.E.setTranslationY(0.0f);
                return;
            default:
                wn wnVar = this.f22695b;
                wnVar.f30059f1 = false;
                wnVar.E.setTranslationY(0.0f);
                wnVar.a0();
                return;
        }
    }
}
