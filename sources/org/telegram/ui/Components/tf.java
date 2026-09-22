package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f28103a;
    public final ChatActivityEnterView f28104b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28104b = chatActivityEnterView;
        this.f28103a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28104b;
        if (animator.equals(chatActivityEnterView.f21835s2)) {
            chatActivityEnterView.f21835s2 = null;
        }
        chatActivityEnterView.y0();
        chatActivityEnterView.f21786j1.setAlpha(1.0f);
        chatActivityEnterView.f21786j1.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.N1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.V;
            chatActivityEnterView2.f21752d4 = true;
            chatActivityEnterView2.f21758e4 = System.currentTimeMillis();
        }
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setAlpha(0.0f);
        }
        if (this.f28103a) {
            gk0 gk0Var = chatActivityEnterView.f21774h1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.f21755e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
