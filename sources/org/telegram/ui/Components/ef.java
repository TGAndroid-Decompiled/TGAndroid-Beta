package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ef extends AnimatorListenerAdapter {
    public final int f33232a;
    public final ChatActivityEnterView f33233b;

    public ef(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33233b = chatActivityEnterView;
        this.f33232a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33233b;
        if (animator.equals(chatActivityEnterView.f31146t2)) {
            int i7 = this.f33232a;
            if (i7 != 3 && chatActivityEnterView.E0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.w();
            if (i7 != 3) {
                zf zfVar = chatActivityEnterView.O1;
                if (zfVar != null) {
                    zfVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
