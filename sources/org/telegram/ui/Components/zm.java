package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f42941a;
    public final tn f42942b;

    public zm(tn tnVar, int i7) {
        this.f42941a = i7;
        this.f42942b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42941a) {
            case 0:
                this.f42942b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42942b.F.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f42942b;
                tnVar.f39961g1 = false;
                tnVar.F.setTranslationY(0.0f);
                tnVar.f0();
                return;
        }
    }
}
