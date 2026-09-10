package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29014a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f29014a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29014a;
        chatActivityEnterView.f20863h1.setAllowDraw(true);
        chatActivityEnterView.M1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
