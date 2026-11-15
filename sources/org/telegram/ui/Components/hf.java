package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f35224a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f35224a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f35224a;
        oi0 oi0Var = chatActivityEnterView.f32214i1;
        if (oi0Var != null && oi0Var.T0 != null) {
            chatActivityEnterView.f32278r5 = new od(3, this, animator);
            return;
        }
        i61 i61Var = chatActivityEnterView.f32200g1;
        if (i61Var != null) {
            i61Var.setVisibility(8);
        }
        oi0 oi0Var2 = chatActivityEnterView.f32214i1;
        if (oi0Var2 != null) {
            oi0Var2.setVisibility(8);
        }
        chatActivityEnterView.X4 = 0.0f;
        chatActivityEnterView.K0();
        chatActivityEnterView.B0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.f32302v2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
