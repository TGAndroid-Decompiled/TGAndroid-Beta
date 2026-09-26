package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f29128a;
    public final ze0 f29129b;

    public ve0(ze0 ze0Var, int i10) {
        this.f29128a = i10;
        this.f29129b = ze0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29128a) {
            case 0:
                this.f29129b.f30863x = null;
                return;
            default:
                this.f29129b.f30864y = null;
                return;
        }
    }
}
