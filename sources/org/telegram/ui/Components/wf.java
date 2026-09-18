package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wf extends AnimatorListenerAdapter {
    public final int f29661a;
    public final ChatActivityEnterView f29662b;

    public wf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29662b = chatActivityEnterView;
        this.f29661a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29662b;
        if (animator.equals(chatActivityEnterView.f21851s2)) {
            int i10 = this.f29661a;
            if (i10 != 3 && chatActivityEnterView.E0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.E0.requestFocus();
            }
            chatActivityEnterView.A();
            if (i10 != 3) {
                qg qgVar = chatActivityEnterView.N1;
                if (qgVar != null) {
                    qgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
