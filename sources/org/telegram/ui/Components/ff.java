package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ff extends AnimatorListenerAdapter {
    public final int f33575a;
    public final ChatActivityEnterView f33576b;

    public ff(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33576b = chatActivityEnterView;
        this.f33575a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33576b;
        if (animator.equals(chatActivityEnterView.f31125t2)) {
            int i7 = this.f33575a;
            if (i7 != 3 && chatActivityEnterView.E0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.w();
            if (i7 != 3) {
                ag agVar = chatActivityEnterView.O1;
                if (agVar != null) {
                    agVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
