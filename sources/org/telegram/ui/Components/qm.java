package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qm extends AnimatorListenerAdapter {
    public final int f38703a;
    public final jn f38704b;

    public qm(jn jnVar, int i7) {
        this.f38703a = i7;
        this.f38704b = jnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38703a) {
            case 0:
                this.f38704b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f38704b.F.setTranslationY(0.0f);
                return;
            default:
                jn jnVar = this.f38704b;
                jnVar.f36085g1 = false;
                jnVar.F.setTranslationY(0.0f);
                jnVar.f0();
                return;
        }
    }
}
