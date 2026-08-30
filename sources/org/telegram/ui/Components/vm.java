package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vm extends AnimatorListenerAdapter {
    public final int f29517a;
    public final qn f29518b;

    public vm(qn qnVar, int i10) {
        this.f29517a = i10;
        this.f29518b = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29517a) {
            case 0:
                this.f29518b.B.setTranslationY(0.0f);
                return;
            case 1:
                this.f29518b.B.setTranslationY(0.0f);
                return;
            default:
                qn qnVar = this.f29518b;
                qnVar.f28165c1 = false;
                qnVar.B.setTranslationY(0.0f);
                qnVar.a0();
                return;
        }
    }
}
