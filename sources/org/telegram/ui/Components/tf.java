package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f39890a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f39890a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f39890a;
        zi0 zi0Var = chatActivityEnterView.f32635i1;
        if (zi0Var != null && zi0Var.T0 != null) {
            chatActivityEnterView.f32766z5 = new mf(1, this, animator);
            return;
        }
        w61 w61Var = chatActivityEnterView.f32620g1;
        if (w61Var != null) {
            w61Var.setVisibility(8);
        }
        zi0 zi0Var2 = chatActivityEnterView.f32635i1;
        if (zi0Var2 != null) {
            zi0Var2.setVisibility(8);
        }
        chatActivityEnterView.f32616f5 = 0.0f;
        chatActivityEnterView.W0();
        chatActivityEnterView.N0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
