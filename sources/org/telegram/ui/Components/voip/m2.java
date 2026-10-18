package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31609a;
    public final n2 f31610b;

    public m2(n2 n2Var, int i10) {
        this.f31609a = i10;
        this.f31610b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31609a) {
            case 0:
                this.f31610b.f31631b.setVisibility(8);
                return;
            default:
                this.f31610b.f31632c.setVisibility(8);
                return;
        }
    }
}
