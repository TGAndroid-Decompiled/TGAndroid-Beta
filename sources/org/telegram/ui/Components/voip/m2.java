package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31648a;
    public final n2 f31649b;

    public m2(n2 n2Var, int i10) {
        this.f31648a = i10;
        this.f31649b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31648a) {
            case 0:
                this.f31649b.f31671b.setVisibility(8);
                return;
            default:
                this.f31649b.f31672c.setVisibility(8);
                return;
        }
    }
}
