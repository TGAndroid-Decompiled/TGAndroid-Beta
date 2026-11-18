package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx0 extends AnimatorListenerAdapter {
    public final int f35179a;
    public final Switch f35180b;

    public fx0(Switch r12, int i7) {
        this.f35179a = i7;
        this.f35180b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35179a) {
            case 0:
                this.f35180b.d = null;
                return;
            default:
                this.f35180b.f33136e = null;
                return;
        }
    }
}
