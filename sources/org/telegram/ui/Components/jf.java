package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f29726a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f29726a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29726a;
        z61 z61Var = chatActivityEnterView.f26082b1;
        if (z61Var != null) {
            z61Var.setVisibility(8);
        }
        vj0 vj0Var = chatActivityEnterView.f26095d1;
        if (vj0Var != null) {
            vj0Var.setVisibility(8);
        }
        chatActivityEnterView.f26140k4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.o0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
