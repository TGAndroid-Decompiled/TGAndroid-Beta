package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f25052a;
    public final PipRoundVideoView f25053b;

    public ig0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25052a = i10;
        this.f25053b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25052a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25053b;
                if (animator.equals(pipRoundVideoView.f22308r)) {
                    pipRoundVideoView.f22308r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25053b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22309s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
