package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class e extends AnimatorListenerAdapter {
    public final ChatActivityEnterView a;

    public e(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        l49 l49Var = chatActivityEnterView.i1;
        if (l49Var != null && l49Var.T0 != null) {
            chatActivityEnterView.y5 = new lx1(this, animator, (byte) 3);
            return;
        }
        tec tecVar = chatActivityEnterView.g1;
        if (tecVar != null) {
            tecVar.setVisibility(8);
        }
        l49 l49Var2 = chatActivityEnterView.i1;
        if (l49Var2 != null) {
            l49Var2.setVisibility(8);
        }
        chatActivityEnterView.e5 = 0.0f;
        chatActivityEnterView.V0();
        chatActivityEnterView.M0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
