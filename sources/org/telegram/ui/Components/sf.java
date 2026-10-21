package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30263a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f30263a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30263a;
        r81 r81Var = chatActivityEnterView.f23943f1;
        if (r81Var != null) {
            r81Var.setVisibility(8);
        }
        el0 el0Var = chatActivityEnterView.f23955h1;
        if (el0Var != null) {
            el0Var.setVisibility(8);
        }
        chatActivityEnterView.f24002p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
