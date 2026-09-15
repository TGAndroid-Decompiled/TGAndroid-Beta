package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final int f30280a;
    public final un f30281b;

    public ym(un unVar, int i10) {
        this.f30280a = i10;
        this.f30281b = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30280a) {
            case 0:
                this.f30281b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f30281b.E.setTranslationY(0.0f);
                return;
            default:
                un unVar = this.f30281b;
                unVar.f28444f1 = false;
                unVar.E.setTranslationY(0.0f);
                unVar.a0();
                return;
        }
    }
}
