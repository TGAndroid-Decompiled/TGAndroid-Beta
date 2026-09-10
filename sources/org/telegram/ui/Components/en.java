package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class en extends AnimatorListenerAdapter {
    public final int f22730a;
    public final zn f22731b;

    public en(zn znVar, int i10) {
        this.f22730a = i10;
        this.f22731b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22730a) {
            case 0:
                this.f22731b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f22731b.E.setTranslationY(0.0f);
                return;
            default:
                zn znVar = this.f22731b;
                znVar.f29743f1 = false;
                znVar.E.setTranslationY(0.0f);
                znVar.a0();
                return;
        }
    }
}
