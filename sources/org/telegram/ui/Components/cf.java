package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf extends AnimatorListenerAdapter {
    public final boolean f32534a;
    public final ChatActivityEnterView f32535b;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
        this.f32535b = chatActivityEnterView;
        this.f32534a = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32535b;
        if (animator.equals(chatActivityEnterView.f31126t2)) {
            chatActivityEnterView.f31126t2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f31073k1.setAlpha(1.0f);
        chatActivityEnterView.f31073k1.setTranslationX(0.0f);
        ag agVar = chatActivityEnterView.O1;
        if (agVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = agVar.f31800b0;
            chatActivityEnterView2.f31040e4 = true;
            chatActivityEnterView2.f31047f4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.f32534a) {
            ji0 ji0Var = chatActivityEnterView.f31056h1;
            if (ji0Var != null) {
                ji0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.f31037e1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
