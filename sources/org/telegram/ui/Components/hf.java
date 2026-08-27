package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class hf extends AnimatorListenerAdapter {

    public final ChatActivityEnterView f28985a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f28985a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28985a;
        chatActivityEnterView.f26091d1.setAllowDraw(true);
        chatActivityEnterView.I1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
