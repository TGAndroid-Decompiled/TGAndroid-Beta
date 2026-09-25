package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f30925a;
    public final vn f30926b;

    public zm(vn vnVar, int i10) {
        this.f30925a = i10;
        this.f30926b = vnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30925a) {
            case 0:
                this.f30926b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f30926b.E.setTranslationY(0.0f);
                return;
            default:
                vn vnVar = this.f30926b;
                vnVar.f29196f1 = false;
                vnVar.E.setTranslationY(0.0f);
                vnVar.a0();
                return;
        }
    }
}
