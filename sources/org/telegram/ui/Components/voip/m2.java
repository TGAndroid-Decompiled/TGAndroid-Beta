package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31674a;
    public final n2 f31675b;

    public m2(n2 n2Var, int i10) {
        this.f31674a = i10;
        this.f31675b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31674a) {
            case 0:
                this.f31675b.f31697b.setVisibility(8);
                return;
            default:
                this.f31675b.f31698c.setVisibility(8);
                return;
        }
    }
}
