package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class af extends AnimatorListenerAdapter {
    public final int f24404a;
    public final ChatActivityEnterView f24405b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24405b = chatActivityEnterView;
        this.f24404a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f24405b;
        if (animator.equals(chatActivityEnterView.f23790t2)) {
            int i10 = this.f24404a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !org.telegram.messenger.i0.C1()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.w();
            if (i10 != 3) {
                wf wfVar = chatActivityEnterView.O1;
                if (wfVar != null) {
                    wfVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
