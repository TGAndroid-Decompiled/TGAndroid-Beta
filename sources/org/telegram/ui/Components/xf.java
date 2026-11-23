package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final int f42067a;
    public final ChatActivityEnterView f42068b;

    public xf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f42068b = chatActivityEnterView;
        this.f42067a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f42068b;
        if (animator.equals(chatActivityEnterView.j3)) {
            int i7 = this.f42067a;
            if (i7 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.F();
            if (i7 != 3) {
                rg rgVar = chatActivityEnterView.E2;
                if (rgVar != null) {
                    rgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
