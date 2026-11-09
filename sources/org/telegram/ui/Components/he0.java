package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he0 extends AnimatorListenerAdapter {
    public final int f34281a;
    public final PipRoundVideoView f34282b;

    public he0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f34281a = i7;
        this.f34282b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34281a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f34282b;
                if (animator.equals(pipRoundVideoView.f31437r)) {
                    pipRoundVideoView.f31437r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f34282b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31438s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
