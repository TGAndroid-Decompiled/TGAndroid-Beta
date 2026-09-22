package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28388a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f28388a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28388a;
        chatActivityEnterView.f21774h1.setAllowDraw(true);
        chatActivityEnterView.M1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.y0();
    }
}
