package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32530a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f32530a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32530a;
        h91 h91Var = chatActivityEnterView.f25878f1;
        if (h91Var != null) {
            h91Var.setVisibility(8);
        }
        gl0 gl0Var = chatActivityEnterView.f25890h1;
        if (gl0Var != null) {
            gl0Var.setVisibility(8);
        }
        chatActivityEnterView.f25939p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.m0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
