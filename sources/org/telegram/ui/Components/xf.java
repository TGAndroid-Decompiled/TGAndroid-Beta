package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32743a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f32743a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32743a;
        g91 g91Var = chatActivityEnterView.f23652f1;
        if (g91Var != null) {
            g91Var.setVisibility(8);
        }
        ol0 ol0Var = chatActivityEnterView.f23664h1;
        if (ol0Var != null) {
            ol0Var.setVisibility(8);
        }
        chatActivityEnterView.S4 = 0.0f;
        chatActivityEnterView.z0();
        chatActivityEnterView.q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
    }
}
