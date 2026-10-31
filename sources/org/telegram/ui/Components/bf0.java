package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf0 extends AnimatorListenerAdapter {
    public final int f24624a;
    public final PipRoundVideoView f24625b;

    public bf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24624a = i10;
        this.f24625b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24624a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24625b;
                if (animator.equals(pipRoundVideoView.f24081r)) {
                    pipRoundVideoView.f24081r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24625b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24082s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
