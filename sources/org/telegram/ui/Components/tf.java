package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30810a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f30810a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30810a;
        chatActivityEnterView.f24098h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.u0();
    }
}
