package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final int f42100a;
    public final qn f42101b;

    public xm(qn qnVar, int i7) {
        this.f42100a = i7;
        this.f42101b = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42100a) {
            case 0:
                this.f42101b.F.setTranslationY(0.0f);
                return;
            case 1:
                this.f42101b.F.setTranslationY(0.0f);
                return;
            default:
                qn qnVar = this.f42101b;
                qnVar.f38922g1 = false;
                qnVar.F.setTranslationY(0.0f);
                qnVar.f0();
                return;
        }
    }
}
