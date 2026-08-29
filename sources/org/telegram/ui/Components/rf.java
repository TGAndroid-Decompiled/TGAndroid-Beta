package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf extends AnimatorListenerAdapter {
    public final int f32280a;
    public final ChatActivityEnterView f32281b;

    public rf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32281b = chatActivityEnterView;
        this.f32280a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32281b;
        if (animator.equals(chatActivityEnterView.f26168o2)) {
            int i10 = this.f32280a;
            if (i10 != 3 && chatActivityEnterView.A0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.A0.requestFocus();
            }
            chatActivityEnterView.A();
            if (i10 != 3) {
                lg lgVar = chatActivityEnterView.J1;
                if (lgVar != null) {
                    lgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
