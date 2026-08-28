package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class lf extends AnimatorListenerAdapter {
    public final boolean f30427a;
    public final ChatActivityEnterView f30428b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30428b = chatActivityEnterView;
        this.f30427a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30428b;
        if (animator.equals(chatActivityEnterView.f26157o2)) {
            chatActivityEnterView.f26157o2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f26109f1.setAlpha(1.0f);
        chatActivityEnterView.f26109f1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.J1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.f26078a4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.A0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.f30427a) {
            vj0 vj0Var = chatActivityEnterView.f26095d1;
            if (vj0Var != null) {
                vj0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.f26077a1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
