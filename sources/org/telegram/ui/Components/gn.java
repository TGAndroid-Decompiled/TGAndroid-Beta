package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gn extends AnimatorListenerAdapter {
    public final int f26730a;
    public final co f26731b;

    public gn(co coVar, int i10) {
        this.f26730a = i10;
        this.f26731b = coVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26730a) {
            case 0:
                this.f26731b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f26731b.E.setTranslationY(0.0f);
                return;
            default:
                co coVar = this.f26731b;
                coVar.f25368f1 = false;
                coVar.E.setTranslationY(0.0f);
                coVar.d0();
                return;
        }
    }
}
