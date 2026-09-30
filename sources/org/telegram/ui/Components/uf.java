package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28844a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f28844a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28844a;
        k81 k81Var = chatActivityEnterView.f22009f1;
        if (k81Var != null) {
            k81Var.setVisibility(8);
        }
        uk0 uk0Var = chatActivityEnterView.f22021h1;
        if (uk0Var != null) {
            uk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22067p4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
