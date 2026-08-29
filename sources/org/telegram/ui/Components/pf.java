package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31667a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f31667a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31667a;
        chatActivityEnterView.f26106d1.setAllowDraw(true);
        chatActivityEnterView.I1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
