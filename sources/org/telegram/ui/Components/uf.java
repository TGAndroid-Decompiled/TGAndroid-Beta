package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f28721a;
    public final ChatActivityEnterView f28722b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28722b = chatActivityEnterView;
        this.f28721a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28722b;
        if (animator.equals(chatActivityEnterView.f22080t2)) {
            chatActivityEnterView.f22080t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22031k1.setAlpha(1.0f);
        chatActivityEnterView.f22031k1.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.O1;
        if (rgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.V;
            chatActivityEnterView2.f21998e4 = true;
            chatActivityEnterView2.f22005f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f28721a) {
            tk0 tk0Var = chatActivityEnterView.f22014h1;
            if (tk0Var != null) {
                tk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f21995e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
