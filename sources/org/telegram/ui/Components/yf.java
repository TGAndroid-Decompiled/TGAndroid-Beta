package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yf extends AnimatorListenerAdapter {
    public final int f30657a;
    public final ChatActivityEnterView f30658b;

    public yf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30658b = chatActivityEnterView;
        this.f30657a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30658b;
        if (animator.equals(chatActivityEnterView.f22068t2)) {
            int i10 = this.f30657a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i10 != 3) {
                sg sgVar = chatActivityEnterView.O1;
                if (sgVar != null) {
                    sgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
