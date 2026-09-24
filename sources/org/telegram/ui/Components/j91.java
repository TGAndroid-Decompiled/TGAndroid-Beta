package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j91 extends AnimatorListenerAdapter {
    public final int f25338a;
    public final k91 f25339b;

    public j91(k91 k91Var, int i10) {
        this.f25338a = i10;
        this.f25339b = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25338a) {
            case 0:
                this.f25339b.f25708y = null;
                return;
            default:
                this.f25339b.f25708y = null;
                return;
        }
    }
}
