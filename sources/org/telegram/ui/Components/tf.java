package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30596a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f30596a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30596a;
        v71 v71Var = chatActivityEnterView.f23698f1;
        if (v71Var != null) {
            v71Var.setVisibility(8);
        }
        gk0 gk0Var = chatActivityEnterView.f23710h1;
        if (gk0Var != null) {
            gk0Var.setVisibility(8);
        }
        chatActivityEnterView.f23750o4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
