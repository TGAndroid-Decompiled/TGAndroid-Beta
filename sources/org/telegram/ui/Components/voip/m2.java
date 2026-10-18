package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31602a;
    public final n2 f31603b;

    public m2(n2 n2Var, int i10) {
        this.f31602a = i10;
        this.f31603b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31602a) {
            case 0:
                this.f31603b.f31624b.setVisibility(8);
                return;
            default:
                this.f31603b.f31625c.setVisibility(8);
                return;
        }
    }
}
