package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends AnimatorListenerAdapter {
    public final int f32406a;
    public final ChatActivityEnterView f32407b;

    public xf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32407b = chatActivityEnterView;
        this.f32406a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32407b;
        if (animator.equals(chatActivityEnterView.f24022t2)) {
            int i10 = this.f32406a;
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
