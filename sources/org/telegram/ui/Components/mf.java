package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29036a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f29036a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29036a;
        chatActivityEnterView.f24598e1.setAllowDraw(true);
        chatActivityEnterView.J1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.x0();
    }
}
