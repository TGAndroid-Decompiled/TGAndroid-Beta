package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class f extends AnimatorListenerAdapter {
    public final ChatActivityEnterView a;

    public f(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        x59 x59Var = chatActivityEnterView.i1;
        if (x59Var != null && x59Var.R0 != null) {
            chatActivityEnterView.A5 = new dy1(this, animator, (byte) 2);
            return;
        }
        qgc qgcVar = chatActivityEnterView.g1;
        if (qgcVar != null) {
            qgcVar.setVisibility(8);
        }
        x59 x59Var2 = chatActivityEnterView.i1;
        if (x59Var2 != null) {
            x59Var2.setVisibility(8);
        }
        chatActivityEnterView.d5 = 0.0f;
        chatActivityEnterView.Y0();
        chatActivityEnterView.Q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
        if (recordCircle != null) {
            recordCircle.h();
        }
    }
}
