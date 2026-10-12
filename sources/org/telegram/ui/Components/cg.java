package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cg extends AnimatorListenerAdapter {
    public final int f24939a;
    public final ChatActivityEnterView f24940b;

    public cg(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24940b = chatActivityEnterView;
        this.f24939a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f24940b;
        if (animator.equals(chatActivityEnterView.f23734t2)) {
            int i10 = this.f24939a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.A();
            if (i10 != 3) {
                wg wgVar = chatActivityEnterView.O1;
                if (wgVar != null) {
                    wgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
