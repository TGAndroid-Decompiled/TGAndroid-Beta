package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31781a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f31781a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31781a;
        c91 c91Var = chatActivityEnterView.f23878f1;
        if (c91Var != null) {
            c91Var.setVisibility(8);
        }
        nl0 nl0Var = chatActivityEnterView.f23890h1;
        if (nl0Var != null) {
            nl0Var.setVisibility(8);
        }
        chatActivityEnterView.f23936p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
