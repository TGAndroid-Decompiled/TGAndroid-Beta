package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f28071a;
    public final ChatActivityEnterView f28072b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28072b = chatActivityEnterView;
        this.f28071a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28072b;
        if (animator.equals(chatActivityEnterView.f21848s2)) {
            chatActivityEnterView.f21848s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f21800j1.setAlpha(1.0f);
        chatActivityEnterView.f21800j1.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.N1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.V;
            chatActivityEnterView2.f21766d4 = true;
            chatActivityEnterView2.f21772e4 = System.currentTimeMillis();
        }
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setAlpha(0.0f);
        }
        if (this.f28071a) {
            hk0 hk0Var = chatActivityEnterView.f21788h1;
            if (hk0Var != null) {
                hk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.f21769e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
