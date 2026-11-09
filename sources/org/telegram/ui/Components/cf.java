package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf extends AnimatorListenerAdapter {
    public final boolean f32651a;
    public final ChatActivityEnterView f32652b;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
        this.f32652b = chatActivityEnterView;
        this.f32651a = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32652b;
        if (animator.equals(chatActivityEnterView.f31135t2)) {
            chatActivityEnterView.f31135t2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f31082k1.setAlpha(1.0f);
        chatActivityEnterView.f31082k1.setTranslationX(0.0f);
        ag agVar = chatActivityEnterView.O1;
        if (agVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = agVar.f31793b0;
            chatActivityEnterView2.f31049e4 = true;
            chatActivityEnterView2.f31056f4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.f32651a) {
            ki0 ki0Var = chatActivityEnterView.f31065h1;
            if (ki0Var != null) {
                ki0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.f31046e1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
