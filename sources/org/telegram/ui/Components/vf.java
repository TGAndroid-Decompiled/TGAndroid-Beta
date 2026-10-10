package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31834a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f31834a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31834a;
        b91 b91Var = chatActivityEnterView.f23890f1;
        if (b91Var != null) {
            b91Var.setVisibility(8);
        }
        ml0 ml0Var = chatActivityEnterView.f23902h1;
        if (ml0Var != null) {
            ml0Var.setVisibility(8);
        }
        chatActivityEnterView.f23948p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
