package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class um extends AnimatorListenerAdapter {
    public final int f29243a;
    public final pn f29244b;

    public um(pn pnVar, int i10) {
        this.f29243a = i10;
        this.f29244b = pnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29243a) {
            case 0:
                this.f29244b.B.setTranslationY(0.0f);
                return;
            case 1:
                this.f29244b.B.setTranslationY(0.0f);
                return;
            default:
                pn pnVar = this.f29244b;
                pnVar.f27937c1 = false;
                pnVar.B.setTranslationY(0.0f);
                pnVar.a0();
                return;
        }
    }
}
