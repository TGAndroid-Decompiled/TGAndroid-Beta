package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29018a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f29018a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29018a;
        chatActivityEnterView.f24596e1.setAllowDraw(true);
        chatActivityEnterView.J1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
