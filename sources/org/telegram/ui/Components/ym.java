package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final int f30581a;
    public final un f30582b;

    public ym(un unVar, int i10) {
        this.f30581a = i10;
        this.f30582b = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30581a) {
            case 0:
                this.f30582b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f30582b.E.setTranslationY(0.0f);
                return;
            default:
                un unVar = this.f30582b;
                unVar.f28745f1 = false;
                unVar.E.setTranslationY(0.0f);
                unVar.a0();
                return;
        }
    }
}
