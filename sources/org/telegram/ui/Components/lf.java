package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class lf extends AnimatorListenerAdapter {
    public final boolean f28704a;
    public final ChatActivityEnterView f28705b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z4) {
        this.f28705b = chatActivityEnterView;
        this.f28704a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28705b;
        if (animator.equals(chatActivityEnterView.f24657p2)) {
            chatActivityEnterView.f24657p2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f24609g1.setAlpha(1.0f);
        chatActivityEnterView.f24609g1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.K1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.S;
            chatActivityEnterView2.f24573a4 = true;
            chatActivityEnterView2.f24580b4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.f28704a) {
            sk0 sk0Var = chatActivityEnterView.f24596e1;
            if (sk0Var != null) {
                sk0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.f24577b1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
