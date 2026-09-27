package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28555a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f28555a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28555a;
        k81 k81Var = chatActivityEnterView.f21990f1;
        if (k81Var != null) {
            k81Var.setVisibility(8);
        }
        tk0 tk0Var = chatActivityEnterView.f22002h1;
        if (tk0Var != null) {
            tk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22048p4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
