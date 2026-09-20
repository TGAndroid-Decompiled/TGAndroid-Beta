package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f28653a;
    public final ChatActivityEnterView f28654b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28654b = chatActivityEnterView;
        this.f28653a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28654b;
        if (animator.equals(chatActivityEnterView.f22059s2)) {
            chatActivityEnterView.f22059s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22011j1.setAlpha(1.0f);
        chatActivityEnterView.f22011j1.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.N1;
        if (rgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.V;
            chatActivityEnterView2.f21977d4 = true;
            chatActivityEnterView2.f21983e4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f28653a) {
            qk0 qk0Var = chatActivityEnterView.f21999h1;
            if (qk0Var != null) {
                qk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f21980e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
