package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f25025a;
    public final PipRoundVideoView f25026b;

    public ig0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25025a = i10;
        this.f25026b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25025a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25026b;
                if (animator.equals(pipRoundVideoView.f22293r)) {
                    pipRoundVideoView.f22293r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25026b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22294s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
