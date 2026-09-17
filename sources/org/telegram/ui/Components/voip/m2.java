package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31675a;
    public final n2 f31676b;

    public m2(n2 n2Var, int i10) {
        this.f31675a = i10;
        this.f31676b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31675a) {
            case 0:
                this.f31676b.f31698b.setVisibility(8);
                return;
            default:
                this.f31676b.f31699c.setVisibility(8);
                return;
        }
    }
}
