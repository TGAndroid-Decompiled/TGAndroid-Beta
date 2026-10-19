package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f30247a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f30247a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30247a;
        q81 q81Var = chatActivityEnterView.f23940f1;
        if (q81Var != null) {
            q81Var.setVisibility(8);
        }
        dl0 dl0Var = chatActivityEnterView.f23952h1;
        if (dl0Var != null) {
            dl0Var.setVisibility(8);
        }
        chatActivityEnterView.f23999p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
