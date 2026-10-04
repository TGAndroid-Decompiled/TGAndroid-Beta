package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f37054a;
    public final ie1 f37055b;

    public he1(ie1 ie1Var, int i10) {
        this.f37054a = i10;
        this.f37055b = ie1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37054a) {
            case 0:
                this.f37055b.h.f38962s.setVisibility(8);
                return;
            default:
                this.f37055b.h.f38955a.setVisibility(8);
                return;
        }
    }
}
