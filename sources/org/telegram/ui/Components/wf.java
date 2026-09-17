package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32258a;

    public wf(ChatActivityEnterView chatActivityEnterView) {
        this.f32258a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32258a;
        chatActivityEnterView.f23710h1.setAllowDraw(true);
        chatActivityEnterView.M1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
