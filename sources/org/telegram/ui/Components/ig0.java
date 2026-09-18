package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f24953a;
    public final PipRoundVideoView f24954b;

    public ig0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24953a = i10;
        this.f24954b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24953a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24954b;
                if (animator.equals(pipRoundVideoView.f22271r)) {
                    pipRoundVideoView.f22271r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24954b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22272s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
