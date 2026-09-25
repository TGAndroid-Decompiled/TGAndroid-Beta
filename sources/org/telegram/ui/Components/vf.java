package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class vf extends AnimatorListenerAdapter {
    public final boolean f29131a;
    public final ChatActivityEnterView f29132b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f29132b = chatActivityEnterView;
        this.f29131a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29132b;
        if (animator.equals(chatActivityEnterView.f22066t2)) {
            chatActivityEnterView.f22066t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22017k1.setAlpha(1.0f);
        chatActivityEnterView.f22017k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f21984e4 = true;
            chatActivityEnterView2.f21991f4 = System.currentTimeMillis();
        }
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setAlpha(0.0f);
        }
        if (this.f29131a) {
            rk0 rk0Var = chatActivityEnterView.f22000h1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f21981e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
