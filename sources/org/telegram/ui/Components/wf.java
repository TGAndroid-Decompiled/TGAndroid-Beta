package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29935a;

    public wf(ChatActivityEnterView chatActivityEnterView) {
        this.f29935a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29935a;
        chatActivityEnterView.f22002h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
