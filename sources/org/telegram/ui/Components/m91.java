package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m91 extends AnimatorListenerAdapter {
    public final int f26385a;
    public final n91 f26386b;

    public m91(n91 n91Var, int i10) {
        this.f26385a = i10;
        this.f26386b = n91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26385a) {
            case 0:
                this.f26386b.f26715y = null;
                return;
            default:
                this.f26386b.f26715y = null;
                return;
        }
    }
}
