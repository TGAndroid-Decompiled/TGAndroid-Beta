package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f40324a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f40324a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40324a;
        chatActivityEnterView.f32607i1.setAllowDraw(true);
        chatActivityEnterView.B2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.S0();
    }
}
