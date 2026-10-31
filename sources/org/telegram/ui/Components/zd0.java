package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f33024a;
    public final be0 f33025b;

    public zd0(be0 be0Var, int i10) {
        this.f33024a = i10;
        this.f33025b = be0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33024a) {
            case 0:
                this.f33025b.f24620s = null;
                return;
            default:
                this.f33025b.f24621w = null;
                return;
        }
    }
}
