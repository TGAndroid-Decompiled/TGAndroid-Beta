package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l91 extends AnimatorListenerAdapter {
    public final int f25945a;
    public final m91 f25946b;

    public l91(m91 m91Var, int i10) {
        this.f25945a = i10;
        this.f25946b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25945a) {
            case 0:
                this.f25946b.f26352y = null;
                return;
            default:
                this.f25946b.f26352y = null;
                return;
        }
    }
}
