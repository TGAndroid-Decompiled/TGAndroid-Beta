package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f37648a;
    public final nv0 f37649b;

    public mv0(nv0 nv0Var, int i7) {
        this.f37648a = i7;
        this.f37649b = nv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37648a) {
            case 0:
                this.f37649b.f37999s.setVisibility(8);
                return;
            case 1:
                this.f37649b.f37999s.setVisibility(8);
                return;
            default:
                this.f37649b.f37999s.setVisibility(8);
                return;
        }
    }
}
