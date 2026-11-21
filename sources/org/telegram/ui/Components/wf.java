package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f41797a;

    public wf(ChatActivityEnterView chatActivityEnterView) {
        this.f41797a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f41797a;
        chatActivityEnterView.f32635i1.setAllowDraw(true);
        chatActivityEnterView.D2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.W0();
    }
}
