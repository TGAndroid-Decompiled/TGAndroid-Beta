package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f32579a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f32579a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32579a;
        i91 i91Var = chatActivityEnterView.f25880f1;
        if (i91Var != null) {
            i91Var.setVisibility(8);
        }
        hl0 hl0Var = chatActivityEnterView.f25892h1;
        if (hl0Var != null) {
            hl0Var.setVisibility(8);
        }
        chatActivityEnterView.f25941p4 = 0.0f;
        chatActivityEnterView.t0();
        chatActivityEnterView.l0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
