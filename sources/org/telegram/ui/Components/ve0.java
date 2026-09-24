package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f29119a;
    public final ze0 f29120b;

    public ve0(ze0 ze0Var, int i10) {
        this.f29119a = i10;
        this.f29120b = ze0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29119a) {
            case 0:
                this.f29120b.f30859x = null;
                return;
            default:
                this.f29120b.f30860y = null;
                return;
        }
    }
}
