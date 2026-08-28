package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30807a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f30807a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30807a;
        chatActivityEnterView.f26095d1.setAllowDraw(true);
        chatActivityEnterView.I1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.w0();
    }
}
