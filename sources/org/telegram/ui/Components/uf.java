package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28378a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f28378a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28378a;
        chatActivityEnterView.f21788h1.setAllowDraw(true);
        chatActivityEnterView.M1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
