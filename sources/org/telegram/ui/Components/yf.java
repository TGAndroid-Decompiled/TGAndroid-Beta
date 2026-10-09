package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f33196a;

    public yf(ChatActivityEnterView chatActivityEnterView) {
        this.f33196a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33196a;
        chatActivityEnterView.f23898h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.v0();
    }
}
