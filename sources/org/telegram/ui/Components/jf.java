package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f25953a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f25953a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f25953a;
        x71 x71Var = chatActivityEnterView.f22718c1;
        if (x71Var != null) {
            x71Var.setVisibility(8);
        }
        qk0 qk0Var = chatActivityEnterView.f22729e1;
        if (qk0Var != null) {
            qk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22772l4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
