package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf extends AnimatorListenerAdapter {
    public final int f31552a;
    public final ChatActivityEnterView f31553b;

    public zf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31553b = chatActivityEnterView;
        this.f31552a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31553b;
        if (animator.equals(chatActivityEnterView.f22663t2)) {
            int i10 = this.f31552a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.y();
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
