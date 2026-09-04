package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31647a;
    public final n2 f31648b;

    public m2(n2 n2Var, int i10) {
        this.f31647a = i10;
        this.f31648b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31647a) {
            case 0:
                this.f31648b.f31670b.setVisibility(8);
                return;
            default:
                this.f31648b.f31671c.setVisibility(8);
                return;
        }
    }
}
