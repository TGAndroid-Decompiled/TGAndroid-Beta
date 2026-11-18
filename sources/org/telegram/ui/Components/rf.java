package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f39116a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f39116a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f39116a;
        xi0 xi0Var = chatActivityEnterView.f32607i1;
        if (xi0Var != null && xi0Var.T0 != null) {
            chatActivityEnterView.f32718x5 = new org.telegram.ui.ci(29, this, animator);
            return;
        }
        t61 t61Var = chatActivityEnterView.f32592g1;
        if (t61Var != null) {
            t61Var.setVisibility(8);
        }
        xi0 xi0Var2 = chatActivityEnterView.f32607i1;
        if (xi0Var2 != null) {
            xi0Var2.setVisibility(8);
        }
        chatActivityEnterView.f32570d5 = 0.0f;
        chatActivityEnterView.S0();
        chatActivityEnterView.J0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
