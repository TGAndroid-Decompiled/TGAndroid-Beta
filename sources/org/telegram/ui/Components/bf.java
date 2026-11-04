package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32167a;

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f32167a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32167a;
        chatActivityEnterView.f31136i1.setAllowDraw(true);
        chatActivityEnterView.O1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.v0();
    }
}
