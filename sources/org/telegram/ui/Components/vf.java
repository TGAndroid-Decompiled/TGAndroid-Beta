package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f40767a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f40767a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40767a;
        chatActivityEnterView.f32604i1.setAllowDraw(true);
        chatActivityEnterView.D2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.W0();
    }
}
