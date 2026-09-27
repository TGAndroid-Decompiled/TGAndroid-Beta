package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l91 extends AnimatorListenerAdapter {
    public final int f25980a;
    public final m91 f25981b;

    public l91(m91 m91Var, int i10) {
        this.f25980a = i10;
        this.f25981b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25980a) {
            case 0:
                this.f25981b.f26409y = null;
                return;
            default:
                this.f25981b.f26409y = null;
                return;
        }
    }
}
