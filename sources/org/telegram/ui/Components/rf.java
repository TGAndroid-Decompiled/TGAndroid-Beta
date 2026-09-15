package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f27628a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f27628a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f27628a;
        v71 v71Var = chatActivityEnterView.f21766f1;
        if (v71Var != null) {
            v71Var.setVisibility(8);
        }
        gk0 gk0Var = chatActivityEnterView.f21778h1;
        if (gk0Var != null) {
            gk0Var.setVisibility(8);
        }
        chatActivityEnterView.f21818o4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
