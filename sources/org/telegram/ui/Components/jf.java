package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28093a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f28093a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28093a;
        y71 y71Var = chatActivityEnterView.f24586c1;
        if (y71Var != null) {
            y71Var.setVisibility(8);
        }
        rk0 rk0Var = chatActivityEnterView.f24598e1;
        if (rk0Var != null) {
            rk0Var.setVisibility(8);
        }
        chatActivityEnterView.f24641l4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
