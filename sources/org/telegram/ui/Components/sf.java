package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32528a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f32528a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32528a;
        h91 h91Var = chatActivityEnterView.f25876f1;
        if (h91Var != null) {
            h91Var.setVisibility(8);
        }
        gl0 gl0Var = chatActivityEnterView.f25888h1;
        if (gl0Var != null) {
            gl0Var.setVisibility(8);
        }
        chatActivityEnterView.f25937p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.m0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
