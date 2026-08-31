package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f33135a;
    public final sn f33136b;

    public xm(sn snVar, int i10) {
        this.f33135a = i10;
        this.f33136b = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33135a) {
            case 0:
                this.f33136b.B.setTranslationY(0.0f);
                return;
            case 1:
                this.f33136b.B.setTranslationY(0.0f);
                return;
            default:
                sn snVar = this.f33136b;
                snVar.f31099c1 = false;
                snVar.B.setTranslationY(0.0f);
                snVar.a0();
                return;
        }
    }
}
