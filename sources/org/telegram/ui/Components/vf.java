package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f40673a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f40673a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40673a;
        chatActivityEnterView.f32702i1.setAllowDraw(true);
        chatActivityEnterView.D2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.X0();
    }
}
