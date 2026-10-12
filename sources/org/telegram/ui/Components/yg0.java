package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yg0 extends AnimatorListenerAdapter {
    public final int f31574a;
    public final PipRoundVideoView f31575b;

    public yg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f31574a = i10;
        this.f31575b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31574a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f31575b;
                if (animator.equals(pipRoundVideoView.f23205r)) {
                    pipRoundVideoView.f23205r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f31575b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f23206s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
