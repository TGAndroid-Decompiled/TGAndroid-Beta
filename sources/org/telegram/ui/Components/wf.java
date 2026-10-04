package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f32523a;
    public final ChatActivityEnterView f32524b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32524b = chatActivityEnterView;
        this.f32523a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32524b;
        if (animator.equals(chatActivityEnterView.f23961t2)) {
            chatActivityEnterView.f23961t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f23912k1.setAlpha(1.0f);
        chatActivityEnterView.f23912k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f23879e4 = true;
            chatActivityEnterView2.f23886f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f32523a) {
            tk0 tk0Var = chatActivityEnterView.f23895h1;
            if (tk0Var != null) {
                tk0Var.setVisibility(8);
            }
            me meVar = chatActivityEnterView.f23876e1;
            if (meVar != null) {
                meVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
