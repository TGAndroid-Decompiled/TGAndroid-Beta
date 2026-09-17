package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f30510a;
    public final PipRoundVideoView f30511b;

    public zf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30510a = i10;
        this.f30511b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30510a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30511b;
                if (animator.equals(pipRoundVideoView.f22095r)) {
                    pipRoundVideoView.f22095r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30511b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22096s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
