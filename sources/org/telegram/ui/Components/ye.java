package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ye extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f40690a;

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.f40690a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40690a;
        a61 a61Var = chatActivityEnterView.f31124g1;
        if (a61Var != null) {
            a61Var.setVisibility(8);
        }
        mi0 mi0Var = chatActivityEnterView.f31136i1;
        if (mi0Var != null) {
            mi0Var.setVisibility(8);
        }
        chatActivityEnterView.f31183q4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.m0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
