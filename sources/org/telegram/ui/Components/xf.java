package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final int f32410a;
    public final ChatActivityEnterView f32411b;

    public xf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32411b = chatActivityEnterView;
        this.f32410a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32411b;
        if (animator.equals(chatActivityEnterView.f24026t2)) {
            int i10 = this.f32410a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.y();
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
