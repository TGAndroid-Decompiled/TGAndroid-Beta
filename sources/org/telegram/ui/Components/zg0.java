package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg0 extends AnimatorListenerAdapter {
    public final int f31558a;
    public final PipRoundVideoView f31559b;

    public zg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f31558a = i10;
        this.f31559b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31558a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f31559b;
                if (animator.equals(pipRoundVideoView.f22905r)) {
                    pipRoundVideoView.f22905r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f31559b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22906s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
