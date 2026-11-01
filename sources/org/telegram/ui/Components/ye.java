package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32816a;

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.f32816a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32816a;
        chatActivityEnterView.f23720h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.u0();
    }
}
