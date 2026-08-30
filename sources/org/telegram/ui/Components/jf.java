package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f25968a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f25968a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f25968a;
        x71 x71Var = chatActivityEnterView.f22745c1;
        if (x71Var != null) {
            x71Var.setVisibility(8);
        }
        rk0 rk0Var = chatActivityEnterView.f22756e1;
        if (rk0Var != null) {
            rk0Var.setVisibility(8);
        }
        chatActivityEnterView.f22799l4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
