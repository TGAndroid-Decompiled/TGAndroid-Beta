package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30927a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f30927a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30927a;
        chatActivityEnterView.f22596h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.v0();
    }
}
