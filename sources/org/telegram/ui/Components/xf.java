package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30238a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f30238a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30238a;
        chatActivityEnterView.f22021h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
