package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class lf extends AnimatorListenerAdapter {
    public final boolean f26626a;
    public final ChatActivityEnterView f26627b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z4) {
        this.f26627b = chatActivityEnterView;
        this.f26626a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f26627b;
        if (animator.equals(chatActivityEnterView.f22817p2)) {
            chatActivityEnterView.f22817p2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22769g1.setAlpha(1.0f);
        chatActivityEnterView.f22769g1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.K1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.S;
            chatActivityEnterView2.f22734a4 = true;
            chatActivityEnterView2.f22741b4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.f26626a) {
            rk0 rk0Var = chatActivityEnterView.f22756e1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.f22738b1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
