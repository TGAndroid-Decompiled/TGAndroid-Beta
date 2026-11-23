package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wf extends AnimatorListenerAdapter {
    public final int f41628a;
    public final ChatActivityEnterView f41629b;

    public wf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f41629b = chatActivityEnterView;
        this.f41628a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f41629b;
        if (animator.equals(chatActivityEnterView.j3)) {
            int i7 = this.f41628a;
            if (i7 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.E();
            if (i7 != 3) {
                qg qgVar = chatActivityEnterView.E2;
                if (qgVar != null) {
                    qgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
