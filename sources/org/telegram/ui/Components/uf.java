package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f30912a;
    public final ChatActivityEnterView f30913b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30913b = chatActivityEnterView;
        this.f30912a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30913b;
        if (animator.equals(chatActivityEnterView.f24022t2)) {
            chatActivityEnterView.f24022t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23973k1.setAlpha(1.0f);
        chatActivityEnterView.f23973k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f23939e4 = true;
            chatActivityEnterView2.f23946f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f30912a) {
            el0 el0Var = chatActivityEnterView.f23955h1;
            if (el0Var != null) {
                el0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f23936e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
