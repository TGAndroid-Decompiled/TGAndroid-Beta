package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ve extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31233a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f31233a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31233a;
        j71 j71Var = chatActivityEnterView.f23707f1;
        if (j71Var != null) {
            j71Var.setVisibility(8);
        }
        nj0 nj0Var = chatActivityEnterView.f23719h1;
        if (nj0Var != null) {
            nj0Var.setVisibility(8);
        }
        chatActivityEnterView.f23768p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.l0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
