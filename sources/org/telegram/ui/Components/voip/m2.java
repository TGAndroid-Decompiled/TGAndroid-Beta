package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31566a;
    public final n2 f31567b;

    public m2(n2 n2Var, int i10) {
        this.f31566a = i10;
        this.f31567b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31566a) {
            case 0:
                this.f31567b.f31588b.setVisibility(8);
                return;
            default:
                this.f31567b.f31589c.setVisibility(8);
                return;
        }
    }
}
