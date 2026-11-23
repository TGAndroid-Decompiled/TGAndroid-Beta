package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f42901a;
    public final tn f42902b;

    public zm(tn tnVar, int i7) {
        this.f42901a = i7;
        this.f42902b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42901a) {
            case 0:
                this.f42902b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42902b.F.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f42902b;
                tnVar.f39940g1 = false;
                tnVar.F.setTranslationY(0.0f);
                tnVar.f0();
                return;
        }
    }
}
