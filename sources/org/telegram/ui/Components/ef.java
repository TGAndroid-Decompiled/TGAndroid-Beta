package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ef extends AnimatorListenerAdapter {

    public final ChatActivityEnterView f28040a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f28040a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28040a;
        b71 b71Var = chatActivityEnterView.f26078b1;
        if (b71Var != null) {
            b71Var.setVisibility(8);
        }
        xj0 xj0Var = chatActivityEnterView.f26091d1;
        if (xj0Var != null) {
            xj0Var.setVisibility(8);
        }
        chatActivityEnterView.f26136k4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
