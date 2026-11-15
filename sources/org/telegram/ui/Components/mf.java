package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mf extends AnimatorListenerAdapter {
    public final int f37239a;
    public final ChatActivityEnterView f37240b;

    public mf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f37240b = chatActivityEnterView;
        this.f37239a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f37240b;
        if (animator.equals(chatActivityEnterView.f32165b3)) {
            int i7 = this.f37239a;
            if (i7 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.C();
            if (i7 != 3) {
                gg ggVar = chatActivityEnterView.f32310w2;
                if (ggVar != null) {
                    ggVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.f32302v2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
