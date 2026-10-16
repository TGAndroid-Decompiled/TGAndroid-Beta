package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29365a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f29365a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29365a;
        y81 y81Var = chatActivityEnterView.f22584f1;
        if (y81Var != null) {
            y81Var.setVisibility(8);
        }
        hl0 hl0Var = chatActivityEnterView.f22596h1;
        if (hl0Var != null) {
            hl0Var.setVisibility(8);
        }
        chatActivityEnterView.f22643p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
