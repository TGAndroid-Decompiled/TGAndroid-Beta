package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class mm extends AnimatorListenerAdapter {

    public final int f30699a;

    public final in f30700b;

    public mm(in inVar, int i10) {
        this.f30699a = i10;
        this.f30700b = inVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30699a) {
            case 0:
                this.f30700b.A.setTranslationY(0.0f);
                break;
            case 1:
                this.f30700b.A.setTranslationY(0.0f);
                break;
            default:
                in inVar = this.f30700b;
                inVar.f29413b1 = false;
                inVar.A.setTranslationY(0.0f);
                inVar.a0();
                break;
        }
    }
}
