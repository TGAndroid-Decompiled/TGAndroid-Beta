package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f35657a;
    public final cd1 f35658b;

    public bd1(cd1 cd1Var, int i10) {
        this.f35657a = i10;
        this.f35658b = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35657a) {
            case 0:
                this.f35658b.f35921s.f37858s.setVisibility(8);
                return;
            default:
                this.f35658b.f35921s.f37852a.setVisibility(8);
                return;
        }
    }
}
