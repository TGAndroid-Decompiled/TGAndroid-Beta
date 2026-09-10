package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf extends AnimatorListenerAdapter {
    public final int f29656a;
    public final ChatActivityEnterView f29657b;

    public zf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29657b = chatActivityEnterView;
        this.f29656a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29657b;
        if (animator.equals(chatActivityEnterView.f20923s2)) {
            int i10 = this.f29656a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i10 != 3) {
                ug ugVar = chatActivityEnterView.N1;
                if (ugVar != null) {
                    ugVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
