package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31748a;
    public final n2 f31749b;

    public m2(n2 n2Var, int i10) {
        this.f31748a = i10;
        this.f31749b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31748a) {
            case 0:
                this.f31749b.f31770b.setVisibility(8);
                return;
            default:
                this.f31749b.f31771c.setVisibility(8);
                return;
        }
    }
}
