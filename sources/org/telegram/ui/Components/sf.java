package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27927a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f27927a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27927a;
        u71 u71Var = chatActivityEnterView.f21736f1;
        if (u71Var != null) {
            u71Var.setVisibility(8);
        }
        hk0 hk0Var = chatActivityEnterView.f21748h1;
        if (hk0Var != null) {
            hk0Var.setVisibility(8);
        }
        chatActivityEnterView.f21789o4 = 0.0f;
        chatActivityEnterView.y0();
        chatActivityEnterView.q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
