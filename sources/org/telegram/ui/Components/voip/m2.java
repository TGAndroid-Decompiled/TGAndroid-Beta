package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f29999a;
    public final n2 f30000b;

    public m2(n2 n2Var, int i10) {
        this.f29999a = i10;
        this.f30000b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29999a) {
            case 0:
                this.f30000b.f30007b.setVisibility(8);
                return;
            default:
                this.f30000b.f30008c.setVisibility(8);
                return;
        }
    }
}
