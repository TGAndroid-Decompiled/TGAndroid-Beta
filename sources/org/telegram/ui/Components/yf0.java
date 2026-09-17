package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f32904a;
    public final PipRoundVideoView f32905b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f32904a = i10;
        this.f32905b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32904a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f32905b;
                if (animator.equals(pipRoundVideoView.f24029r)) {
                    pipRoundVideoView.f24029r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f32905b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24030s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
