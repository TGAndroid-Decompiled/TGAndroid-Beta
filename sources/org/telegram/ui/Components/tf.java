package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f28074a;
    public final ChatActivityEnterView f28075b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28075b = chatActivityEnterView;
        this.f28074a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28075b;
        if (animator.equals(chatActivityEnterView.f21851s2)) {
            chatActivityEnterView.f21851s2 = null;
        }
        chatActivityEnterView.y0();
        chatActivityEnterView.f21802j1.setAlpha(1.0f);
        chatActivityEnterView.f21802j1.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.N1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.V;
            chatActivityEnterView2.f21768d4 = true;
            chatActivityEnterView2.f21774e4 = System.currentTimeMillis();
        }
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setAlpha(0.0f);
        }
        if (this.f28074a) {
            hk0 hk0Var = chatActivityEnterView.f21790h1;
            if (hk0Var != null) {
                hk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.f21771e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
