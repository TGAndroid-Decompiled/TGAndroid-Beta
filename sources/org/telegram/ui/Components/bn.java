package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bn extends AnimatorListenerAdapter {
    public final int f25011a;
    public final xn f25012b;

    public bn(xn xnVar, int i10) {
        this.f25011a = i10;
        this.f25012b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25011a) {
            case 0:
                this.f25012b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f25012b.E.setTranslationY(0.0f);
                return;
            default:
                xn xnVar = this.f25012b;
                xnVar.f32924f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.Z();
                return;
        }
    }
}
