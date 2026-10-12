package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ln extends AnimatorListenerAdapter {
    public final int f27070a;
    public final io f27071b;

    public ln(io ioVar, int i10) {
        this.f27070a = i10;
        this.f27071b = ioVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27070a) {
            case 0:
                this.f27071b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27071b.E.setTranslationY(0.0f);
                return;
            default:
                io ioVar = this.f27071b;
                ioVar.f26012f1 = false;
                ioVar.E.setTranslationY(0.0f);
                ioVar.d0();
                return;
        }
    }
}
