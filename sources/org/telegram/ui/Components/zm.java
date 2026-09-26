package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f30924a;
    public final vn f30925b;

    public zm(vn vnVar, int i10) {
        this.f30924a = i10;
        this.f30925b = vnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30924a) {
            case 0:
                this.f30925b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f30925b.E.setTranslationY(0.0f);
                return;
            default:
                vn vnVar = this.f30925b;
                vnVar.f29195f1 = false;
                vnVar.E.setTranslationY(0.0f);
                vnVar.a0();
                return;
        }
    }
}
