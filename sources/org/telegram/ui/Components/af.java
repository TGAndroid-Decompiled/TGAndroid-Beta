package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class af extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31786a;

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f31786a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31786a;
        c61 c61Var = chatActivityEnterView.f31043f1;
        if (c61Var != null) {
            c61Var.setVisibility(8);
        }
        ji0 ji0Var = chatActivityEnterView.f31055h1;
        if (ji0Var != null) {
            ji0Var.setVisibility(8);
        }
        chatActivityEnterView.f31102p4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
