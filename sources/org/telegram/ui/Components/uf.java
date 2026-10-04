package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31370a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f31370a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31370a;
        s81 s81Var = chatActivityEnterView.f23887f1;
        if (s81Var != null) {
            s81Var.setVisibility(8);
        }
        tk0 tk0Var = chatActivityEnterView.f23899h1;
        if (tk0Var != null) {
            tk0Var.setVisibility(8);
        }
        chatActivityEnterView.f23945p4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
