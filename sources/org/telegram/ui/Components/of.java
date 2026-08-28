package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class of extends AnimatorListenerAdapter {
    public final int f31376a;
    public final ChatActivityEnterView f31377b;

    public of(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f31377b = chatActivityEnterView;
        this.f31376a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31377b;
        if (animator.equals(chatActivityEnterView.f26157o2)) {
            int i9 = this.f31376a;
            if (i9 != 3 && chatActivityEnterView.A0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.A0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i9 != 3) {
                ig igVar = chatActivityEnterView.J1;
                if (igVar != null) {
                    igVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
