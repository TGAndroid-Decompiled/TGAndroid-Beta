package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f25404a;
    public final PipRoundVideoView f25405b;

    public jg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25404a = i10;
        this.f25405b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25404a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25405b;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25405b;
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
