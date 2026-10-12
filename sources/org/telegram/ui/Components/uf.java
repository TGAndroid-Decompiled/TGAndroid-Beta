package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29681a;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f29681a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29681a;
        x81 x81Var = chatActivityEnterView.f22884f1;
        if (x81Var != null) {
            x81Var.setVisibility(8);
        }
        hl0 hl0Var = chatActivityEnterView.f22896h1;
        if (hl0Var != null) {
            hl0Var.setVisibility(8);
        }
        chatActivityEnterView.f22943p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
