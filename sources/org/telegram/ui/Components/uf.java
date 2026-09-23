package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f28477a;
    public final ChatActivityEnterView f28478b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28478b = chatActivityEnterView;
        this.f28477a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28478b;
        if (animator.equals(chatActivityEnterView.f21809s2)) {
            chatActivityEnterView.f21809s2 = null;
        }
        chatActivityEnterView.y0();
        chatActivityEnterView.f21760j1.setAlpha(1.0f);
        chatActivityEnterView.f21760j1.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.N1;
        if (rgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.V;
            chatActivityEnterView2.f21726d4 = true;
            chatActivityEnterView2.f21732e4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f28477a) {
            hk0 hk0Var = chatActivityEnterView.f21748h1;
            if (hk0Var != null) {
                hk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f21729e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
