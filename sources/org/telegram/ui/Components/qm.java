package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qm extends AnimatorListenerAdapter {
    public final int f38701a;
    public final jn f38702b;

    public qm(jn jnVar, int i7) {
        this.f38701a = i7;
        this.f38702b = jnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38701a) {
            case 0:
                this.f38702b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f38702b.F.setTranslationY(0.0f);
                return;
            default:
                jn jnVar = this.f38702b;
                jnVar.f36075g1 = false;
                jnVar.F.setTranslationY(0.0f);
                jnVar.f0();
                return;
        }
    }
}
