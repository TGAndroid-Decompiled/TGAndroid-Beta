package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dh0 extends AnimatorListenerAdapter {
    public final int f25366a;
    public final PipRoundVideoView f25367b;

    public dh0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25366a = i10;
        this.f25367b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25366a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25367b;
                if (animator.equals(pipRoundVideoView.f23995r)) {
                    pipRoundVideoView.f23995r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25367b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f23996s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
