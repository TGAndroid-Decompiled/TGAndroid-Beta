package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z81 extends AnimatorListenerAdapter {
    public final int f31286a;
    public final a91 f31287b;

    public z81(a91 a91Var, int i10) {
        this.f31286a = i10;
        this.f31287b = a91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31286a) {
            case 0:
                this.f31287b.f23332y = null;
                return;
            default:
                this.f31287b.f23332y = null;
                return;
        }
    }
}
