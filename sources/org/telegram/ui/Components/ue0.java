package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ue0 extends AnimatorListenerAdapter {
    public final int f40363a;
    public final PipRoundVideoView f40364b;

    public ue0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f40363a = i7;
        this.f40364b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40363a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f40364b;
                if (animator.equals(pipRoundVideoView.f33107r)) {
                    pipRoundVideoView.f33107r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f40364b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f33108s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
