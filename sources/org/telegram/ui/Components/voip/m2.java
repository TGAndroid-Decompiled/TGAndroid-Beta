package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31718a;
    public final n2 f31719b;

    public m2(n2 n2Var, int i10) {
        this.f31718a = i10;
        this.f31719b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31718a) {
            case 0:
                this.f31719b.f31740b.setVisibility(8);
                return;
            default:
                this.f31719b.f31741c.setVisibility(8);
                return;
        }
    }
}
