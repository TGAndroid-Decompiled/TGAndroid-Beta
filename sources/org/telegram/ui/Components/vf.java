package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f33644a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f33644a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33644a;
        chatActivityEnterView.f25890h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.u0();
    }
}
