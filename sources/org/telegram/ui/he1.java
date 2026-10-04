package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f37060a;
    public final ie1 f37061b;

    public he1(ie1 ie1Var, int i10) {
        this.f37060a = i10;
        this.f37061b = ie1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37060a) {
            case 0:
                this.f37061b.h.f38968s.setVisibility(8);
                return;
            default:
                this.f37061b.h.f38961a.setVisibility(8);
                return;
        }
    }
}
