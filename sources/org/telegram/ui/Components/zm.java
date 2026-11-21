package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final int f42938a;
    public final tn f42939b;

    public zm(tn tnVar, int i7) {
        this.f42938a = i7;
        this.f42939b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42938a) {
            case 0:
                this.f42939b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42939b.F.setTranslationY(0.0f);
                return;
            default:
                tn tnVar = this.f42939b;
                tnVar.f39969g1 = false;
                tnVar.F.setTranslationY(0.0f);
                tnVar.f0();
                return;
        }
    }
}
