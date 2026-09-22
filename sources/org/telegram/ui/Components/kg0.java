package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f25694a;
    public final PipRoundVideoView f25695b;

    public kg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25694a = i10;
        this.f25695b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25694a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25695b;
                if (animator.equals(pipRoundVideoView.f22322r)) {
                    pipRoundVideoView.f22322r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25695b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22323s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
