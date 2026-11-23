package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f40814a;
    public final PipRoundVideoView f40815b;

    public ve0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f40814a = i7;
        this.f40815b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40814a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f40815b;
                if (animator.equals(pipRoundVideoView.f33043r)) {
                    pipRoundVideoView.f33043r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f40815b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f33044s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
