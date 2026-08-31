package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a91 extends AnimatorListenerAdapter {
    public final int f25212a;
    public final b91 f25213b;

    public a91(b91 b91Var, int i10) {
        this.f25212a = i10;
        this.f25213b = b91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25212a) {
            case 0:
                this.f25213b.f25539y = null;
                return;
            default:
                this.f25213b.f25539y = null;
                return;
        }
    }
}
