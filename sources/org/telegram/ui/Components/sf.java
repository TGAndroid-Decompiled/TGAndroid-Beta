package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28101a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f28101a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28101a;
        j81 j81Var = chatActivityEnterView.f21987f1;
        if (j81Var != null) {
            j81Var.setVisibility(8);
        }
        qk0 qk0Var = chatActivityEnterView.f21999h1;
        if (qk0Var != null) {
            qk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22039o4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
