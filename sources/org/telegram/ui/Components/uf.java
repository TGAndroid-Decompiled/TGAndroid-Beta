package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27659a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f27659a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27659a;
        i81 i81Var = chatActivityEnterView.f20851f1;
        if (i81Var != null) {
            i81Var.setVisibility(8);
        }
        qk0 qk0Var = chatActivityEnterView.f20863h1;
        if (qk0Var != null) {
            qk0Var.setVisibility(8);
        }
        chatActivityEnterView.f20903o4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
