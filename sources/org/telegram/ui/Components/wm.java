package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wm extends AnimatorListenerAdapter {
    public final int f32791a;
    public final rn f32792b;

    public wm(rn rnVar, int i10) {
        this.f32791a = i10;
        this.f32792b = rnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32791a) {
            case 0:
                this.f32792b.B.setTranslationY(0.0f);
                return;
            case 1:
                this.f32792b.B.setTranslationY(0.0f);
                return;
            default:
                rn rnVar = this.f32792b;
                rnVar.f30819c1 = false;
                rnVar.B.setTranslationY(0.0f);
                rnVar.a0();
                return;
        }
    }
}
