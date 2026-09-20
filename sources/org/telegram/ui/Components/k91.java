package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k91 extends AnimatorListenerAdapter {
    public final int f25722a;
    public final l91 f25723b;

    public k91(l91 l91Var, int i10) {
        this.f25722a = i10;
        this.f25723b = l91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25722a) {
            case 0:
                this.f25723b.f26088y = null;
                return;
            default:
                this.f25723b.f26088y = null;
                return;
        }
    }
}
