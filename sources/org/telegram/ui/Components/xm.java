package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f32611a;
    public final tn f32612b;

    public xm(tn tnVar, int i10) {
        this.f32611a = i10;
        this.f32612b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32611a) {
            case 0:
                this.f32612b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f32612b.E.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f32612b;
                tnVar.f30635f1 = false;
                tnVar.E.setTranslationY(0.0f);
                tnVar.a0();
                return;
        }
    }
}
