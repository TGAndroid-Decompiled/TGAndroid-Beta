package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f30266a;
    public final PipRoundVideoView f30267b;

    public sg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30266a = i10;
        this.f30267b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30266a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30267b;
                if (animator.equals(pipRoundVideoView.f24260r)) {
                    pipRoundVideoView.f24260r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30267b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24261s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
