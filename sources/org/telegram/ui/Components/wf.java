package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f32529a;
    public final ChatActivityEnterView f32530b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32530b = chatActivityEnterView;
        this.f32529a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32530b;
        if (animator.equals(chatActivityEnterView.f23965t2)) {
            chatActivityEnterView.f23965t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f23916k1.setAlpha(1.0f);
        chatActivityEnterView.f23916k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f23883e4 = true;
            chatActivityEnterView2.f23890f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f32529a) {
            tk0 tk0Var = chatActivityEnterView.f23899h1;
            if (tk0Var != null) {
                tk0Var.setVisibility(8);
            }
            me meVar = chatActivityEnterView.f23880e1;
            if (meVar != null) {
                meVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
