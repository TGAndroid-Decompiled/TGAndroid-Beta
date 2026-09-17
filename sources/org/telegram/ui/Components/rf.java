package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27601a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f27601a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27601a;
        w71 w71Var = chatActivityEnterView.f21776f1;
        if (w71Var != null) {
            w71Var.setVisibility(8);
        }
        hk0 hk0Var = chatActivityEnterView.f21788h1;
        if (hk0Var != null) {
            hk0Var.setVisibility(8);
        }
        chatActivityEnterView.f21828o4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
