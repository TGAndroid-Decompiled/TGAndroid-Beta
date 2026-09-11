package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f32903a;
    public final PipRoundVideoView f32904b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f32903a = i10;
        this.f32904b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32903a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f32904b;
                if (animator.equals(pipRoundVideoView.f24028r)) {
                    pipRoundVideoView.f24028r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f32904b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24029s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
