package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wf extends AnimatorListenerAdapter {
    public final int f41764a;
    public final ChatActivityEnterView f41765b;

    public wf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f41765b = chatActivityEnterView;
        this.f41764a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f41765b;
        if (animator.equals(chatActivityEnterView.j3)) {
            int i7 = this.f41764a;
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
