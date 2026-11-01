package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ve extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31268a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f31268a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31268a;
        k71 k71Var = chatActivityEnterView.f23708f1;
        if (k71Var != null) {
            k71Var.setVisibility(8);
        }
        oj0 oj0Var = chatActivityEnterView.f23720h1;
        if (oj0Var != null) {
            oj0Var.setVisibility(8);
        }
        chatActivityEnterView.f23769p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.l0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
