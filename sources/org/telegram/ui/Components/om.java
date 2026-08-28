package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final int f31411a;
    public final jn f31412b;

    public om(jn jnVar, int i9) {
        this.f31411a = i9;
        this.f31412b = jnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31411a) {
            case 0:
                this.f31412b.A.setTranslationY(0.0f);
                return;
            case 1:
                this.f31412b.A.setTranslationY(0.0f);
                return;
            default:
                jn jnVar = this.f31412b;
                jnVar.f29767b1 = false;
                jnVar.A.setTranslationY(0.0f);
                jnVar.Z();
                return;
        }
    }
}
