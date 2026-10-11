package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch0 extends AnimatorListenerAdapter {
    public final int f25213a;
    public final PipRoundVideoView f25214b;

    public ch0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25213a = i10;
        this.f25214b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25213a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25214b;
                if (animator.equals(pipRoundVideoView.f24210r)) {
                    pipRoundVideoView.f24210r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25214b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24211s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
