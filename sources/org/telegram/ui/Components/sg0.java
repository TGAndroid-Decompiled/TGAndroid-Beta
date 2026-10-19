package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f30258a;
    public final PipRoundVideoView f30259b;

    public sg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30258a = i10;
        this.f30259b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30258a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30259b;
                if (animator.equals(pipRoundVideoView.f24261r)) {
                    pipRoundVideoView.f24261r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30259b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24262s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
