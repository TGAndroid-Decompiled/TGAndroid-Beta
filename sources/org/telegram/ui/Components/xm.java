package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f32639a;
    public final tn f32640b;

    public xm(tn tnVar, int i10) {
        this.f32639a = i10;
        this.f32640b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32639a) {
            case 0:
                this.f32640b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f32640b.E.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f32640b;
                tnVar.f30663f1 = false;
                tnVar.E.setTranslationY(0.0f);
                tnVar.a0();
                return;
        }
    }
}
