package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hm extends AnimatorListenerAdapter {
    public final int f34406a;
    public final an f34407b;

    public hm(an anVar, int i7) {
        this.f34406a = i7;
        this.f34407b = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34406a) {
            case 0:
                this.f34407b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f34407b.E.setTranslationY(0.0f);
                return;
            default:
                an anVar = this.f34407b;
                anVar.f31899f1 = false;
                anVar.E.setTranslationY(0.0f);
                anVar.f0();
                return;
        }
    }
}
