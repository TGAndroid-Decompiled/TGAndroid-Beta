package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28527a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f28527a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28527a;
        j81 j81Var = chatActivityEnterView.f21987f1;
        if (j81Var != null) {
            j81Var.setVisibility(8);
        }
        sk0 sk0Var = chatActivityEnterView.f21999h1;
        if (sk0Var != null) {
            sk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22045p4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
