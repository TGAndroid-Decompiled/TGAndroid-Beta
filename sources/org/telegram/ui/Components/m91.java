package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m91 extends AnimatorListenerAdapter {
    public final int f26247a;
    public final n91 f26248b;

    public m91(n91 n91Var, int i10) {
        this.f26247a = i10;
        this.f26248b = n91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26247a) {
            case 0:
                this.f26248b.f26639y = null;
                return;
            default:
                this.f26248b.f26639y = null;
                return;
        }
    }
}
