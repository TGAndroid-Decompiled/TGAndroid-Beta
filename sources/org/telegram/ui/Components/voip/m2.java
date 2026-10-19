package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31611a;
    public final n2 f31612b;

    public m2(n2 n2Var, int i10) {
        this.f31611a = i10;
        this.f31612b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31611a) {
            case 0:
                this.f31612b.f31633b.setVisibility(8);
                return;
            default:
                this.f31612b.f31634c.setVisibility(8);
                return;
        }
    }
}
