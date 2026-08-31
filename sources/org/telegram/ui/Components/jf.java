package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f28106a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f28106a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28106a;
        z71 z71Var = chatActivityEnterView.f24584c1;
        if (z71Var != null) {
            z71Var.setVisibility(8);
        }
        sk0 sk0Var = chatActivityEnterView.f24596e1;
        if (sk0Var != null) {
            sk0Var.setVisibility(8);
        }
        chatActivityEnterView.f24639l4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
