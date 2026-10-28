package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jn extends AnimatorListenerAdapter {
    public final int f29698a;
    public final go f29699b;

    public jn(go goVar, int i10) {
        this.f29698a = i10;
        this.f29699b = goVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29698a) {
            case 0:
                this.f29699b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f29699b.E.setTranslationY(0.0f);
                return;
            default:
                go goVar = this.f29699b;
                goVar.f28672f1 = false;
                goVar.E.setTranslationY(0.0f);
                goVar.d0();
                return;
        }
    }
}
