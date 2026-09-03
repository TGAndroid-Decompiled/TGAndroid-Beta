package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z81 extends AnimatorListenerAdapter {
    public final int f31306a;
    public final a91 f31307b;

    public z81(a91 a91Var, int i10) {
        this.f31306a = i10;
        this.f31307b = a91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31306a) {
            case 0:
                this.f31307b.f23352y = null;
                return;
            default:
                this.f31307b.f23352y = null;
                return;
        }
    }
}
