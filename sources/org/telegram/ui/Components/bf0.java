package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf0 extends AnimatorListenerAdapter {
    public final int f24724a;
    public final PipRoundVideoView f24725b;

    public bf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24724a = i10;
        this.f24725b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24724a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24725b;
                if (animator.equals(pipRoundVideoView.f24082r)) {
                    pipRoundVideoView.f24082r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24725b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24083s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
