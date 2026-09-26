package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class vf extends AnimatorListenerAdapter {
    public final boolean f29130a;
    public final ChatActivityEnterView f29131b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f29131b = chatActivityEnterView;
        this.f29130a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29131b;
        if (animator.equals(chatActivityEnterView.f22065t2)) {
            chatActivityEnterView.f22065t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22016k1.setAlpha(1.0f);
        chatActivityEnterView.f22016k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f21983e4 = true;
            chatActivityEnterView2.f21990f4 = System.currentTimeMillis();
        }
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setAlpha(0.0f);
        }
        if (this.f29130a) {
            rk0 rk0Var = chatActivityEnterView.f21999h1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f21980e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
