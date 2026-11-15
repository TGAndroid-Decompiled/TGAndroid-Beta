package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f35970a;
    public final PipRoundVideoView f35971b;

    public je0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f35970a = i7;
        this.f35971b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35970a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f35971b;
                if (animator.equals(pipRoundVideoView.f32610r)) {
                    pipRoundVideoView.f32610r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f35971b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f32611s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
