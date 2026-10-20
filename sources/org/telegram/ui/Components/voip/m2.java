package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31562a;
    public final n2 f31563b;

    public m2(n2 n2Var, int i10) {
        this.f31562a = i10;
        this.f31563b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31562a) {
            case 0:
                this.f31563b.f31584b.setVisibility(8);
                return;
            default:
                this.f31563b.f31585c.setVisibility(8);
                return;
        }
    }
}
