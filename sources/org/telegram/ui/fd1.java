package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fd1 extends AnimatorListenerAdapter {
    public final int f37307a;
    public final gd1 f37308b;

    public fd1(gd1 gd1Var, int i10) {
        this.f37307a = i10;
        this.f37308b = gd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37307a) {
            case 0:
                this.f37308b.f37580s.f39517s.setVisibility(8);
                return;
            default:
                this.f37308b.f37580s.f39511a.setVisibility(8);
                return;
        }
    }
}
