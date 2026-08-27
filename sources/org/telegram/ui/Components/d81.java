package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d81 extends AnimatorListenerAdapter {

    public final int f27671a;

    public final e81 f27672b;

    public d81(e81 e81Var, int i10) {
        this.f27671a = i10;
        this.f27672b = e81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27671a) {
            case 0:
                this.f27672b.f27983y = null;
                break;
            default:
                this.f27672b.f27983y = null;
                break;
        }
    }
}
