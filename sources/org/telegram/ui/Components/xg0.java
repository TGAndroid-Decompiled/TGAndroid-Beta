package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f32560a;
    public final PipRoundVideoView f32561b;

    public xg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f32560a = i10;
        this.f32561b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32560a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f32561b;
                if (animator.equals(pipRoundVideoView.f24408r)) {
                    pipRoundVideoView.f24408r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f32561b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24409s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
