package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f27324a;
    public final fo f27325b;

    public in(fo foVar, int i10) {
        this.f27324a = i10;
        this.f27325b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27324a) {
            case 0:
                this.f27325b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27325b.E.setTranslationY(0.0f);
                return;
            default:
                fo foVar = this.f27325b;
                foVar.f26274f1 = false;
                foVar.E.setTranslationY(0.0f);
                foVar.d0();
                return;
        }
    }
}
