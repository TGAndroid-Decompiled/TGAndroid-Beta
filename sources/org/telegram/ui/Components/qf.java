package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29901a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f29901a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29901a;
        y81 y81Var = chatActivityEnterView.f24086f1;
        if (y81Var != null) {
            y81Var.setVisibility(8);
        }
        gl0 gl0Var = chatActivityEnterView.f24098h1;
        if (gl0Var != null) {
            gl0Var.setVisibility(8);
        }
        chatActivityEnterView.f24147p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.m0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
