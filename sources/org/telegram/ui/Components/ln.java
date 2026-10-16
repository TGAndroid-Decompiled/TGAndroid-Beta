package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ln extends AnimatorListenerAdapter {
    public final int f26771a;
    public final io f26772b;

    public ln(io ioVar, int i10) {
        this.f26771a = i10;
        this.f26772b = ioVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26771a) {
            case 0:
                this.f26772b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f26772b.E.setTranslationY(0.0f);
                return;
            default:
                io ioVar = this.f26772b;
                ioVar.f25675f1 = false;
                ioVar.E.setTranslationY(0.0f);
                ioVar.d0();
                return;
        }
    }
}
