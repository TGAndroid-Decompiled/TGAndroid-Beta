package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vf extends AnimatorListenerAdapter {
    public final ChatActivityEnterView f31766a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f31766a = chatActivityEnterView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31766a;
        a91 a91Var = chatActivityEnterView.f23886f1;
        if (a91Var != null) {
            a91Var.setVisibility(8);
        }
        ll0 ll0Var = chatActivityEnterView.f23898h1;
        if (ll0Var != null) {
            ll0Var.setVisibility(8);
        }
        chatActivityEnterView.f23944p4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
