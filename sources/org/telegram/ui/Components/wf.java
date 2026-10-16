package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f30538a;
    public final ChatActivityEnterView f30539b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30539b = chatActivityEnterView;
        this.f30538a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30539b;
        if (animator.equals(chatActivityEnterView.f22663t2)) {
            chatActivityEnterView.f22663t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f22614k1.setAlpha(1.0f);
        chatActivityEnterView.f22614k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f22580e4 = true;
            chatActivityEnterView2.f22587f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f30538a) {
            hl0 hl0Var = chatActivityEnterView.f22596h1;
            if (hl0Var != null) {
                hl0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f22577e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
