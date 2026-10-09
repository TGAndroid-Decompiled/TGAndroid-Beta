package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class on extends AnimatorListenerAdapter {
    public final int f29515a;
    public final lo f29516b;

    public on(lo loVar, int i10) {
        this.f29515a = i10;
        this.f29516b = loVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29515a) {
            case 0:
                this.f29516b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f29516b.E.setTranslationY(0.0f);
                return;
            default:
                lo loVar = this.f29516b;
                loVar.f28506f1 = false;
                loVar.E.setTranslationY(0.0f);
                loVar.d0();
                return;
        }
    }
}
