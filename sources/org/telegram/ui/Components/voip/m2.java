package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31563a;
    public final n2 f31564b;

    public m2(n2 n2Var, int i10) {
        this.f31563a = i10;
        this.f31564b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31563a) {
            case 0:
                this.f31564b.f31585b.setVisibility(8);
                return;
            default:
                this.f31564b.f31586c.setVisibility(8);
                return;
        }
    }
}
