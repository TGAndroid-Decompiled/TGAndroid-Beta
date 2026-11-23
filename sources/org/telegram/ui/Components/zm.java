package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f42942a;
    public final tn f42943b;

    public zm(tn tnVar, int i7) {
        this.f42942a = i7;
        this.f42943b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42942a) {
            case 0:
                this.f42943b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42943b.F.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f42943b;
                tnVar.f39962g1 = false;
                tnVar.F.setTranslationY(0.0f);
                tnVar.f0();
                return;
        }
    }
}
