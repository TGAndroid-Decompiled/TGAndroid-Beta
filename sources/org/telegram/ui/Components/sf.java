package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30249a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f30249a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30249a;
        q81 q81Var = chatActivityEnterView.f23942f1;
        if (q81Var != null) {
            q81Var.setVisibility(8);
        }
        dl0 dl0Var = chatActivityEnterView.f23954h1;
        if (dl0Var != null) {
            dl0Var.setVisibility(8);
        }
        chatActivityEnterView.f24001p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
