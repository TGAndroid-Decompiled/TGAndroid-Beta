package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qm extends AnimatorListenerAdapter {
    public final int f29678a;
    public final jn f29679b;

    public qm(jn jnVar, int i10) {
        this.f29678a = i10;
        this.f29679b = jnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29678a) {
            case 0:
                this.f29679b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f29679b.E.setTranslationY(0.0f);
                return;
            default:
                jn jnVar = this.f29679b;
                jnVar.f27421f1 = false;
                jnVar.E.setTranslationY(0.0f);
                jnVar.d0();
                return;
        }
    }
}
