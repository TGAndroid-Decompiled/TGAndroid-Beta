package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kf extends AnimatorListenerAdapter {
    public final boolean f36408a;
    public final ChatActivityEnterView f36409b;

    public kf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f36409b = chatActivityEnterView;
        this.f36408a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f36409b;
        if (animator.equals(chatActivityEnterView.f32165b3)) {
            chatActivityEnterView.f32165b3 = null;
        }
        chatActivityEnterView.K0();
        chatActivityEnterView.S1.setAlpha(1.0f);
        chatActivityEnterView.S1.setTranslationX(0.0f);
        gg ggVar = chatActivityEnterView.f32310w2;
        if (ggVar != null && org.telegram.messenger.gz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = ggVar.Q0;
            chatActivityEnterView2.M4 = true;
            chatActivityEnterView2.N4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.F0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.f36408a) {
            oi0 oi0Var = chatActivityEnterView.f32214i1;
            if (oi0Var != null) {
                oi0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.f32193f1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.K0();
        }
    }
}
