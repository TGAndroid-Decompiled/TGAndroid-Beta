package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final int f22697a;
    public final wn f22698b;

    public an(wn wnVar, int i10) {
        this.f22697a = i10;
        this.f22698b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22697a) {
            case 0:
                this.f22698b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f22698b.E.setTranslationY(0.0f);
                return;
            default:
                wn wnVar = this.f22698b;
                wnVar.f30068f1 = false;
                wnVar.E.setTranslationY(0.0f);
                wnVar.a0();
                return;
        }
    }
}
