package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class of extends AnimatorListenerAdapter {
    public final int f27553a;
    public final ChatActivityEnterView f27554b;

    public of(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27554b = chatActivityEnterView;
        this.f27553a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27554b;
        if (animator.equals(chatActivityEnterView.f22817p2)) {
            int i10 = this.f27553a;
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
