package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vf extends AnimatorListenerAdapter {
    public final int f40603a;
    public final ChatActivityEnterView f40604b;

    public vf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40604b = chatActivityEnterView;
        this.f40603a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40604b;
        if (animator.equals(chatActivityEnterView.f32602h3)) {
            int i7 = this.f40603a;
            if (i7 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.F();
            if (i7 != 3) {
                pg pgVar = chatActivityEnterView.C2;
                if (pgVar != null) {
                    pgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
