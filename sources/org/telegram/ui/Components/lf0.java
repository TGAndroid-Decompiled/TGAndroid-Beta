package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class lf0 extends AnimatorListenerAdapter {

    public final int f30368a;

    public final PipRoundVideoView f30369b;

    public lf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30368a = i10;
        this.f30369b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30368a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30369b;
                if (animator.equals(pipRoundVideoView.f26426r)) {
                    pipRoundVideoView.f26426r = null;
                }
                break;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30369b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26427s;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
