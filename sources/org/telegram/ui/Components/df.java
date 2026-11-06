package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class df extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32833a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f32833a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32833a;
        chatActivityEnterView.f31055h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.w0();
    }
}
