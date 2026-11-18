package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f42145a;
    public final rn f42146b;

    public xm(rn rnVar, int i7) {
        this.f42145a = i7;
        this.f42146b = rnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42145a) {
            case 0:
                this.f42146b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42146b.F.setTranslationY(0.0f);
                return;
            default:
                rn rnVar = this.f42146b;
                rnVar.f39220g1 = false;
                rnVar.F.setTranslationY(0.0f);
                rnVar.f0();
                return;
        }
    }
}
