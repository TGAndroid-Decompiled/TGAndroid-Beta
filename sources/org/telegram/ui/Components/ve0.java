package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f40765a;
    public final PipRoundVideoView f40766b;

    public ve0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f40765a = i7;
        this.f40766b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40765a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f40766b;
                if (animator.equals(pipRoundVideoView.f33009r)) {
                    pipRoundVideoView.f33009r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f40766b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f33010s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
