package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final int f30277a;
    public final un f30278b;

    public ym(un unVar, int i10) {
        this.f30277a = i10;
        this.f30278b = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30277a) {
            case 0:
                this.f30278b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f30278b.E.setTranslationY(0.0f);
                return;
            default:
                un unVar = this.f30278b;
                unVar.f28441f1 = false;
                unVar.E.setTranslationY(0.0f);
                unVar.a0();
                return;
        }
    }
}
