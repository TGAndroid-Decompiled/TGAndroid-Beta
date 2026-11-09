package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class df extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32942a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f32942a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32942a;
        chatActivityEnterView.f31065h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.w0();
    }
}
