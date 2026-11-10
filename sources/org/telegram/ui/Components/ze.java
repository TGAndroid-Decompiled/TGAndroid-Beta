package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ze extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f40920a;

    public ze(ChatActivityEnterView chatActivityEnterView) {
        this.f40920a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40920a;
        h61 h61Var = chatActivityEnterView.f31064f1;
        if (h61Var != null) {
            h61Var.setVisibility(8);
        }
        ji0 ji0Var = chatActivityEnterView.f31076h1;
        if (ji0Var != null) {
            ji0Var.setVisibility(8);
        }
        chatActivityEnterView.f31123p4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
