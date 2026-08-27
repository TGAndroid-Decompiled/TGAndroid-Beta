package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class bf0 extends AnimatorListenerAdapter {

    public final int f27088a;

    public final cf0 f27089b;

    public bf0(cf0 cf0Var, int i10) {
        this.f27088a = i10;
        this.f27089b = cf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27088a) {
            case 0:
                this.f27089b.f27413a.f27742n.setVisibility(8);
                break;
            default:
                this.f27089b.f27413a.h.setVisibility(8);
                break;
        }
    }
}
