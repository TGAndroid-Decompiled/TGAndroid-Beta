package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25903a;
    public final if0 f25904b;

    public ef0(if0 if0Var, int i10) {
        this.f25903a = i10;
        this.f25904b = if0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25903a) {
            case 0:
                this.f25904b.f27241x = null;
                return;
            default:
                this.f25904b.f27242y = null;
                return;
        }
    }
}
