package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f30513a;
    public final PipRoundVideoView f30514b;

    public zf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30513a = i10;
        this.f30514b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30513a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30514b;
                if (animator.equals(pipRoundVideoView.f22098r)) {
                    pipRoundVideoView.f22098r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30514b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22099s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
