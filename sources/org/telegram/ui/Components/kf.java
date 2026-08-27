package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class kf extends AnimatorListenerAdapter {

    public final int f30094a;

    public final ChatActivityEnterView f30095b;

    public kf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30095b = chatActivityEnterView;
        this.f30094a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30095b;
        if (animator.equals(chatActivityEnterView.f26153o2)) {
            int i10 = this.f30094a;
            if (i10 != 3 && chatActivityEnterView.A0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.A0.requestFocus();
            }
            chatActivityEnterView.B();
            if (i10 != 3) {
                eg egVar = chatActivityEnterView.J1;
                if (egVar != null) {
                    egVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
