package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class af extends AnimatorListenerAdapter {
    public final boolean f31822a;
    public final ChatActivityEnterView f31823b;

    public af(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f31823b = chatActivityEnterView;
        this.f31822a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31823b;
        if (animator.equals(chatActivityEnterView.f31205u2)) {
            chatActivityEnterView.f31205u2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f31152l1.setAlpha(1.0f);
        chatActivityEnterView.f31152l1.setTranslationX(0.0f);
        yf yfVar = chatActivityEnterView.P1;
        if (yfVar != null && org.telegram.messenger.az.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = yfVar.f40698c0;
            chatActivityEnterView2.f31121f4 = true;
            chatActivityEnterView2.f31127g4 = System.currentTimeMillis();
        }
        ve veVar = chatActivityEnterView.F0;
        if (veVar != null) {
            veVar.setAlpha(0.0f);
        }
        if (this.f31822a) {
            mi0 mi0Var = chatActivityEnterView.f31136i1;
            if (mi0Var != null) {
                mi0Var.setVisibility(8);
            }
            sd sdVar = chatActivityEnterView.f31118f1;
            if (sdVar != null) {
                sdVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
