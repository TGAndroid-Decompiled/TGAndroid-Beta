package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf extends AnimatorListenerAdapter {
    public final boolean f32547a;
    public final ChatActivityEnterView f32548b;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
        this.f32548b = chatActivityEnterView;
        this.f32547a = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32548b;
        if (animator.equals(chatActivityEnterView.f31125t2)) {
            chatActivityEnterView.f31125t2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f31072k1.setAlpha(1.0f);
        chatActivityEnterView.f31072k1.setTranslationX(0.0f);
        ag agVar = chatActivityEnterView.O1;
        if (agVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = agVar.f31804b0;
            chatActivityEnterView2.f31039e4 = true;
            chatActivityEnterView2.f31046f4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.f32547a) {
            ji0 ji0Var = chatActivityEnterView.f31055h1;
            if (ji0Var != null) {
                ji0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.f31036e1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
