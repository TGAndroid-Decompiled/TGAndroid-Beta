package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f31144a;
    public final ChatActivityEnterView f31145b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f31145b = chatActivityEnterView;
        this.f31144a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31145b;
        if (animator.equals(chatActivityEnterView.f24167t2)) {
            chatActivityEnterView.f24167t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f24115k1.setAlpha(1.0f);
        chatActivityEnterView.f24115k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.f30482b0;
            chatActivityEnterView2.f24081e4 = true;
            chatActivityEnterView2.f24088f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f31144a) {
            hl0 hl0Var = chatActivityEnterView.f24097h1;
            if (hl0Var != null) {
                hl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f24078e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
