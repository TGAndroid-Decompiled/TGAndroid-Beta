package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f36765a;

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f36765a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f36765a;
        chatActivityEnterView.f32214i1.setAllowDraw(true);
        chatActivityEnterView.f32302v2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.K0();
    }
}
