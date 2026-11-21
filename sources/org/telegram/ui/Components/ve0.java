package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f40812a;
    public final PipRoundVideoView f40813b;

    public ve0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f40812a = i7;
        this.f40813b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40812a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f40813b;
                if (animator.equals(pipRoundVideoView.f33040r)) {
                    pipRoundVideoView.f33040r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f40813b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f33041s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
