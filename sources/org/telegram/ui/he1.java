package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f37055a;
    public final ie1 f37056b;

    public he1(ie1 ie1Var, int i10) {
        this.f37055a = i10;
        this.f37056b = ie1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37055a) {
            case 0:
                this.f37056b.h.f38963s.setVisibility(8);
                return;
            default:
                this.f37056b.h.f38956a.setVisibility(8);
                return;
        }
    }
}
