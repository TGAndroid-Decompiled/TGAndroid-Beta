package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f32931a;
    public final PipRoundVideoView f32932b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f32931a = i10;
        this.f32932b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32931a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f32932b;
                if (animator.equals(pipRoundVideoView.f24056r)) {
                    pipRoundVideoView.f24056r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f32932b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24057s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
