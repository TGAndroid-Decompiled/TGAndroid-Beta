package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f27309a;
    public final fo f27310b;

    public in(fo foVar, int i10) {
        this.f27309a = i10;
        this.f27310b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27309a) {
            case 0:
                this.f27310b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27310b.E.setTranslationY(0.0f);
                return;
            default:
                fo foVar = this.f27310b;
                foVar.f26289f1 = false;
                foVar.E.setTranslationY(0.0f);
                foVar.d0();
                return;
        }
    }
}
