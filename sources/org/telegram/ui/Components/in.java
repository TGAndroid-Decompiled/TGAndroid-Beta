package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f27371a;
    public final fo f27372b;

    public in(fo foVar, int i10) {
        this.f27371a = i10;
        this.f27372b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27371a) {
            case 0:
                this.f27372b.E.setTranslationY(0.0f);
                return;
            case 1:
                this.f27372b.E.setTranslationY(0.0f);
                return;
            default:
                fo foVar = this.f27372b;
                foVar.f26396f1 = false;
                foVar.E.setTranslationY(0.0f);
                foVar.d0();
                return;
        }
    }
}
