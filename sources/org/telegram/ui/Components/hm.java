package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hm extends AnimatorListenerAdapter {
    public final int f34453a;
    public final an f34454b;

    public hm(an anVar, int i3) {
        this.f34453a = i3;
        this.f34454b = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34453a) {
            case 0:
                this.f34454b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f34454b.F.setTranslationY(0.0f);
                return;
            default:
                an anVar = this.f34454b;
                anVar.f31917g1 = false;
                anVar.F.setTranslationY(0.0f);
                anVar.f0();
                return;
        }
    }
}
