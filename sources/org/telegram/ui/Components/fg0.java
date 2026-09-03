package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg0 extends AnimatorListenerAdapter {
    public final int f26910a;
    public final PipRoundVideoView f26911b;

    public fg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f26910a = i10;
        this.f26911b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26910a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f26911b;
                if (animator.equals(pipRoundVideoView.f24929r)) {
                    pipRoundVideoView.f24929r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f26911b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24930s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
