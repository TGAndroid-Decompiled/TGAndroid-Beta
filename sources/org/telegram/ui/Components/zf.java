package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf extends AnimatorListenerAdapter {
    public final int f33493a;
    public final ChatActivityEnterView f33494b;

    public zf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33494b = chatActivityEnterView;
        this.f33493a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33494b;
        if (animator.equals(chatActivityEnterView.f23965t2)) {
            int i10 = this.f33493a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i10 != 3) {
                tg tgVar = chatActivityEnterView.O1;
                if (tgVar != null) {
                    tgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
