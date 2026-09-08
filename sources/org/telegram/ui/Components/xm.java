package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f32638a;
    public final tn f32639b;

    public xm(tn tnVar, int i10) {
        this.f32638a = i10;
        this.f32639b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32638a) {
            case 0:
                this.f32639b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f32639b.E.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f32639b;
                tnVar.f30662f1 = false;
                tnVar.E.setTranslationY(0.0f);
                tnVar.a0();
                return;
        }
    }
}
