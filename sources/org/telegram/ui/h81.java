package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h81 extends AnimatorListenerAdapter {
    public final int f48509a;
    public final i81 f48510b;

    public h81(i81 i81Var, int i7) {
        this.f48509a = i7;
        this.f48510b = i81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48509a) {
            case 0:
                this.f48510b.f48749b.f50268s.setVisibility(8);
                return;
            default:
                this.f48510b.f48749b.f50261a.setVisibility(8);
                return;
        }
    }
}
