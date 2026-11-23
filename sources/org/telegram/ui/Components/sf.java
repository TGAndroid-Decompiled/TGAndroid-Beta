package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f39590a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f39590a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f39590a;
        zi0 zi0Var = chatActivityEnterView.f32702i1;
        if (zi0Var != null && zi0Var.T0 != null) {
            chatActivityEnterView.f32833z5 = new xd(3, this, animator);
            return;
        }
        x61 x61Var = chatActivityEnterView.f32687g1;
        if (x61Var != null) {
            x61Var.setVisibility(8);
        }
        zi0 zi0Var2 = chatActivityEnterView.f32702i1;
        if (zi0Var2 != null) {
            zi0Var2.setVisibility(8);
        }
        chatActivityEnterView.f32683f5 = 0.0f;
        chatActivityEnterView.X0();
        chatActivityEnterView.O0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
