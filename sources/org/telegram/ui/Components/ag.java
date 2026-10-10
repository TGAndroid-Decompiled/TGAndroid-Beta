package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ag extends AnimatorListenerAdapter {
    public final int f24564a;
    public final ChatActivityEnterView f24565b;

    public ag(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24565b = chatActivityEnterView;
        this.f24564a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f24565b;
        if (animator.equals(chatActivityEnterView.f23968t2)) {
            int i10 = this.f24564a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.y();
            if (i10 != 3) {
                ug ugVar = chatActivityEnterView.O1;
                if (ugVar != null) {
                    ugVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
