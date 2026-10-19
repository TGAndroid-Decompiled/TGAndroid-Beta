package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f27326a;
    public final fo f27327b;

    public in(fo foVar, int i10) {
        this.f27326a = i10;
        this.f27327b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27326a) {
            case 0:
                this.f27327b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27327b.E.setTranslationY(0.0f);
                return;
            default:
                fo foVar = this.f27327b;
                foVar.f26276f1 = false;
                foVar.E.setTranslationY(0.0f);
                foVar.d0();
                return;
        }
    }
}
