package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class sf extends AnimatorListenerAdapter {
    public final boolean f30487a;
    public final ChatActivityEnterView f30488b;

    public sf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30488b = chatActivityEnterView;
        this.f30487a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30488b;
        if (animator.equals(chatActivityEnterView.f24168t2)) {
            chatActivityEnterView.f24168t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f24116k1.setAlpha(1.0f);
        chatActivityEnterView.f24116k1.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.O1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.f29915b0;
            chatActivityEnterView2.f24082e4 = true;
            chatActivityEnterView2.f24089f4 = System.currentTimeMillis();
        }
        nf nfVar = chatActivityEnterView.E0;
        if (nfVar != null) {
            nfVar.setAlpha(0.0f);
        }
        if (this.f30487a) {
            gl0 gl0Var = chatActivityEnterView.f24098h1;
            if (gl0Var != null) {
                gl0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.f24079e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
