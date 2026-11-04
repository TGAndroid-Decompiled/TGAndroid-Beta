package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ae0 extends AnimatorListenerAdapter {
    public final int f31820a;
    public final PipRoundVideoView f31821b;

    public ae0(PipRoundVideoView pipRoundVideoView, int i3) {
        this.f31820a = i3;
        this.f31821b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31820a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f31821b;
                if (animator.equals(pipRoundVideoView.f31503r)) {
                    pipRoundVideoView.f31503r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f31821b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31504s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
