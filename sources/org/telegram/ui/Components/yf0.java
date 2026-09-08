package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f32930a;
    public final PipRoundVideoView f32931b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f32930a = i10;
        this.f32931b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32930a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f32931b;
                if (animator.equals(pipRoundVideoView.f24055r)) {
                    pipRoundVideoView.f24055r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f32931b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24056s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
