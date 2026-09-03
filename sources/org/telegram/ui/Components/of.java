package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class of extends AnimatorListenerAdapter {
    public final int f29745a;
    public final ChatActivityEnterView f29746b;

    public of(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29746b = chatActivityEnterView;
        this.f29745a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29746b;
        if (animator.equals(chatActivityEnterView.f24659p2)) {
            int i10 = this.f29745a;
            if (i10 != 3 && chatActivityEnterView.B0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.B0.requestFocus();
            }
            chatActivityEnterView.A();
            if (i10 != 3) {
                ig igVar = chatActivityEnterView.K1;
                if (igVar != null) {
                    igVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
