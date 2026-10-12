package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dh0 extends AnimatorListenerAdapter {
    public final int f25358a;
    public final PipRoundVideoView f25359b;

    public dh0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25358a = i10;
        this.f25359b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25358a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25359b;
                if (animator.equals(pipRoundVideoView.f23996r)) {
                    pipRoundVideoView.f23996r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25359b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f23997s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
