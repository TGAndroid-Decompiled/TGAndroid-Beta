package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class df extends AnimatorListenerAdapter {
    public final int f33062a;
    public final ChatActivityEnterView f33063b;

    public df(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f33063b = chatActivityEnterView;
        this.f33062a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33063b;
        if (animator.equals(chatActivityEnterView.f31205u2)) {
            int i3 = this.f33062a;
            if (i3 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.w();
            if (i3 != 3) {
                yf yfVar = chatActivityEnterView.P1;
                if (yfVar != null) {
                    yfVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
