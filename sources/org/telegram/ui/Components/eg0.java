package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg0 extends AnimatorListenerAdapter {
    public final int f24608a;
    public final PipRoundVideoView f24609b;

    public eg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24608a = i10;
        this.f24609b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24608a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24609b;
                if (animator.equals(pipRoundVideoView.f23048r)) {
                    pipRoundVideoView.f23048r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24609b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f23049s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
