package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class af extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31778a;

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f31778a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31778a;
        i61 i61Var = chatActivityEnterView.f31053f1;
        if (i61Var != null) {
            i61Var.setVisibility(8);
        }
        ki0 ki0Var = chatActivityEnterView.f31065h1;
        if (ki0Var != null) {
            ki0Var.setVisibility(8);
        }
        chatActivityEnterView.f31112p4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
