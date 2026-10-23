package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31567a;
    public final n2 f31568b;

    public m2(n2 n2Var, int i10) {
        this.f31567a = i10;
        this.f31568b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31567a) {
            case 0:
                this.f31568b.f31589b.setVisibility(8);
                return;
            default:
                this.f31568b.f31590c.setVisibility(8);
                return;
        }
    }
}
