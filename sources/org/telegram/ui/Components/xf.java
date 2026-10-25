package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final int f34700a;
    public final ChatActivityEnterView f34701b;

    public xf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f34701b = chatActivityEnterView;
        this.f34700a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f34701b;
        if (animator.equals(chatActivityEnterView.f25958t2)) {
            int i10 = this.f34700a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.w();
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
