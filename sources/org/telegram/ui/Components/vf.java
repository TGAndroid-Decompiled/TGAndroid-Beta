package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vf extends AnimatorListenerAdapter {
    public final int f31439a;
    public final ChatActivityEnterView f31440b;

    public vf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31440b = chatActivityEnterView;
        this.f31439a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31440b;
        if (animator.equals(chatActivityEnterView.f24168t2)) {
            int i10 = this.f31439a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.x();
            if (i10 != 3) {
                qg qgVar = chatActivityEnterView.O1;
                if (qgVar != null) {
                    qgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
