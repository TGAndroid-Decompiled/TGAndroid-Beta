package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f30863a;
    public final ChatActivityEnterView f30864b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30864b = chatActivityEnterView;
        this.f30863a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30864b;
        if (animator.equals(chatActivityEnterView.f22963t2)) {
            chatActivityEnterView.f22963t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f22914k1.setAlpha(1.0f);
        chatActivityEnterView.f22914k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f22880e4 = true;
            chatActivityEnterView2.f22887f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f30863a) {
            hl0 hl0Var = chatActivityEnterView.f22896h1;
            if (hl0Var != null) {
                hl0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f22877e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
