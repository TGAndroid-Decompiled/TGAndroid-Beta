package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f25051a;
    public final PipRoundVideoView f25052b;

    public ig0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25051a = i10;
        this.f25052b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25051a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25052b;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25052b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22308s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
