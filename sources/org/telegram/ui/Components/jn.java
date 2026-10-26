package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jn extends AnimatorListenerAdapter {
    public final int f29676a;
    public final go f29677b;

    public jn(go goVar, int i10) {
        this.f29676a = i10;
        this.f29677b = goVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29676a) {
            case 0:
                this.f29677b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f29677b.E.setTranslationY(0.0f);
                return;
            default:
                go goVar = this.f29677b;
                goVar.f28625f1 = false;
                goVar.E.setTranslationY(0.0f);
                goVar.d0();
                return;
        }
    }
}
