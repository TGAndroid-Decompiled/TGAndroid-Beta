package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30670a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f30670a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30670a;
        l71 l71Var = chatActivityEnterView.f26094b1;
        if (l71Var != null) {
            l71Var.setVisibility(8);
        }
        gk0 gk0Var = chatActivityEnterView.f26106d1;
        if (gk0Var != null) {
            gk0Var.setVisibility(8);
        }
        chatActivityEnterView.f26151k4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
