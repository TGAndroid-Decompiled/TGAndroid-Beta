package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class le0 extends AnimatorListenerAdapter {
    public final int f25886a;
    public final pe0 f25887b;

    public le0(pe0 pe0Var, int i10) {
        this.f25886a = i10;
        this.f25887b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25886a) {
            case 0:
                this.f25887b.f27015x = null;
                return;
            default:
                this.f25887b.f27016y = null;
                return;
        }
    }
}
