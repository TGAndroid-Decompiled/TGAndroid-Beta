package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yf extends AnimatorListenerAdapter {
    public final int f30653a;
    public final ChatActivityEnterView f30654b;

    public yf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30654b = chatActivityEnterView;
        this.f30653a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30654b;
        if (animator.equals(chatActivityEnterView.f22065t2)) {
            int i10 = this.f30653a;
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
