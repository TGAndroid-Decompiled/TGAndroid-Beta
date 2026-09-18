package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27604a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f27604a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27604a;
        w71 w71Var = chatActivityEnterView.f21778f1;
        if (w71Var != null) {
            w71Var.setVisibility(8);
        }
        hk0 hk0Var = chatActivityEnterView.f21790h1;
        if (hk0Var != null) {
            hk0Var.setVisibility(8);
        }
        chatActivityEnterView.f21831o4 = 0.0f;
        chatActivityEnterView.y0();
        chatActivityEnterView.q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
