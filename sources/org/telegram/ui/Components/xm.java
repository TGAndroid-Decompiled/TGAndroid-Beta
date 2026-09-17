package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f32612a;
    public final tn f32613b;

    public xm(tn tnVar, int i10) {
        this.f32612a = i10;
        this.f32613b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32612a) {
            case 0:
                this.f32613b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f32613b.E.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f32613b;
                tnVar.f30636f1 = false;
                tnVar.E.setTranslationY(0.0f);
                tnVar.a0();
                return;
        }
    }
}
