package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class j extends AnimatorListenerAdapter {
    public final byte a;
    public final ChatActivityEnterView b;

    public j(ChatActivityEnterView chatActivityEnterView, int i) {
        this.b = chatActivityEnterView;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            byte b = this.a;
            if (b != 3 && chatActivityEnterView.F0 != null && !gm.A1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.C();
            if (b != 3) {
                l lVar = chatActivityEnterView.E2;
                if (lVar != null) {
                    lVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
