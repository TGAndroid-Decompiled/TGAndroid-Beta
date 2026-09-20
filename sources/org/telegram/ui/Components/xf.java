package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final int f30256a;
    public final ChatActivityEnterView f30257b;

    public xf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30257b = chatActivityEnterView;
        this.f30256a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30257b;
        if (animator.equals(chatActivityEnterView.f22059s2)) {
            int i10 = this.f30256a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i10 != 3) {
                rg rgVar = chatActivityEnterView.N1;
                if (rgVar != null) {
                    rgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
