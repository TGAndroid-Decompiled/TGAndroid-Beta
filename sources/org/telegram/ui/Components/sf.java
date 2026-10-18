package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30262a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f30262a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30262a;
        p81 p81Var = chatActivityEnterView.f23946f1;
        if (p81Var != null) {
            p81Var.setVisibility(8);
        }
        dl0 dl0Var = chatActivityEnterView.f23958h1;
        if (dl0Var != null) {
            dl0Var.setVisibility(8);
        }
        chatActivityEnterView.f24005p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
