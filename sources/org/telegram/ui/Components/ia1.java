package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ia1 extends AnimatorListenerAdapter {
    public final int f29280a;
    public final ja1 f29281b;

    public ia1(ja1 ja1Var, int i10) {
        this.f29280a = i10;
        this.f29281b = ja1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29280a) {
            case 0:
                this.f29281b.f29611y = null;
                return;
            default:
                this.f29281b.f29611y = null;
                return;
        }
    }
}
