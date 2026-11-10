package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32546a;

    public cf(ChatActivityEnterView chatActivityEnterView) {
        this.f32546a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32546a;
        chatActivityEnterView.f31076h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.w0();
    }
}
