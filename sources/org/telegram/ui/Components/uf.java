package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f30950a;
    public final ChatActivityEnterView f30951b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30951b = chatActivityEnterView;
        this.f30950a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30951b;
        if (animator.equals(chatActivityEnterView.f24021t2)) {
            chatActivityEnterView.f24021t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23972k1.setAlpha(1.0f);
        chatActivityEnterView.f23972k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f23938e4 = true;
            chatActivityEnterView2.f23945f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f30950a) {
            dl0 dl0Var = chatActivityEnterView.f23954h1;
            if (dl0Var != null) {
                dl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f23935e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
