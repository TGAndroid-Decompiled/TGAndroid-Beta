package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bn extends AnimatorListenerAdapter {
    public final int f25027a;
    public final xn f25028b;

    public bn(xn xnVar, int i10) {
        this.f25027a = i10;
        this.f25028b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25027a) {
            case 0:
                this.f25028b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f25028b.E.setTranslationY(0.0f);
                return;
            default:
                xn xnVar = this.f25028b;
                xnVar.f33015f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.Z();
                return;
        }
    }
}
