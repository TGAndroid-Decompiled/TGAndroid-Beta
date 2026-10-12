package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final int f29868a;
    public final no f29869b;

    public qn(no noVar, int i10) {
        this.f29868a = i10;
        this.f29869b = noVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29868a) {
            case 0:
                this.f29869b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f29869b.E.setTranslationY(0.0f);
                return;
            default:
                no noVar = this.f29869b;
                noVar.f28888f1 = false;
                noVar.E.setTranslationY(0.0f);
                noVar.d0();
                return;
        }
    }
}
