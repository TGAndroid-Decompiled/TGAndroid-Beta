package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f35641a;
    public final cd1 f35642b;

    public bd1(cd1 cd1Var, int i10) {
        this.f35641a = i10;
        this.f35642b = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35641a) {
            case 0:
                this.f35642b.f35888s.f37834s.setVisibility(8);
                return;
            default:
                this.f35642b.f35888s.f37828a.setVisibility(8);
                return;
        }
    }
}
