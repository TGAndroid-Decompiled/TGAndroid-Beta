package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f35680a;
    public final cd1 f35681b;

    public bd1(cd1 cd1Var, int i10) {
        this.f35680a = i10;
        this.f35681b = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35680a) {
            case 0:
                this.f35681b.f35934s.f37872s.setVisibility(8);
                return;
            default:
                this.f35681b.f35934s.f37866a.setVisibility(8);
                return;
        }
    }
}
