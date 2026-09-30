package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bn extends AnimatorListenerAdapter {
    public final int f22981a;
    public final xn f22982b;

    public bn(xn xnVar, int i10) {
        this.f22981a = i10;
        this.f22982b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22981a) {
            case 0:
                this.f22982b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f22982b.E.setTranslationY(0.0f);
                return;
            default:
                xn xnVar = this.f22982b;
                xnVar.f30395f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.a0();
                return;
        }
    }
}
