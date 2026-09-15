package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f28106a;
    public final ChatActivityEnterView f28107b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28107b = chatActivityEnterView;
        this.f28106a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28107b;
        if (animator.equals(chatActivityEnterView.f21838s2)) {
            chatActivityEnterView.f21838s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f21790j1.setAlpha(1.0f);
        chatActivityEnterView.f21790j1.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.N1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.V;
            chatActivityEnterView2.f21756d4 = true;
            chatActivityEnterView2.f21762e4 = System.currentTimeMillis();
        }
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setAlpha(0.0f);
        }
        if (this.f28106a) {
            gk0 gk0Var = chatActivityEnterView.f21778h1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.f21759e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
