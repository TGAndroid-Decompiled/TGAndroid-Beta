package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bn extends AnimatorListenerAdapter {
    public final int f25006a;
    public final xn f25007b;

    public bn(xn xnVar, int i10) {
        this.f25006a = i10;
        this.f25007b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25006a) {
            case 0:
                this.f25007b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f25007b.E.setTranslationY(0.0f);
                return;
            default:
                xn xnVar = this.f25007b;
                xnVar.f32918f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.Z();
                return;
        }
    }
}
