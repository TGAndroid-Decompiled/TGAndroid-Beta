package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f27304a;
    public final fo f27305b;

    public in(fo foVar, int i10) {
        this.f27304a = i10;
        this.f27305b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27304a) {
            case 0:
                this.f27305b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27305b.E.setTranslationY(0.0f);
                return;
            default:
                fo foVar = this.f27305b;
                foVar.f26298f1 = false;
                foVar.E.setTranslationY(0.0f);
                foVar.d0();
                return;
        }
    }
}
