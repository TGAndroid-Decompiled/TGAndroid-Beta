package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27021a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f27021a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27021a;
        chatActivityEnterView.f22729e1.setAllowDraw(true);
        chatActivityEnterView.J1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
