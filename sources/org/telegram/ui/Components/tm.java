package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tm extends AnimatorListenerAdapter {
    public final int f32975a;
    public final on f32976b;

    public tm(on onVar, int i10) {
        this.f32975a = i10;
        this.f32976b = onVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32975a) {
            case 0:
                this.f32976b.A.setTranslationY(0.0f);
                return;
            case 1:
                this.f32976b.A.setTranslationY(0.0f);
                return;
            default:
                on onVar = this.f32976b;
                onVar.f31403b1 = false;
                onVar.A.setTranslationY(0.0f);
                onVar.a0();
                return;
        }
    }
}
