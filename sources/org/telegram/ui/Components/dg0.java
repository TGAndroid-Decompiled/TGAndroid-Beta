package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dg0 extends AnimatorListenerAdapter {
    public final int f24266a;
    public final PipRoundVideoView f24267b;

    public dg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24266a = i10;
        this.f24267b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24266a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24267b;
                if (animator.equals(pipRoundVideoView.f23075r)) {
                    pipRoundVideoView.f23075r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24267b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f23076s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
