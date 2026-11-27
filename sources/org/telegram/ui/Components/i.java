package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i extends AnimatorListenerAdapter {
    public final ChatActivityEnterView a;

    public i(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.i1.setAllowDraw(true);
        chatActivityEnterView.C2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.Y0();
    }
}
