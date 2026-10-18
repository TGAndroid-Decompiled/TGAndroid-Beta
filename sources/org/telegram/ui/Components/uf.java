package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f30982a;
    public final ChatActivityEnterView f30983b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30983b = chatActivityEnterView;
        this.f30982a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30983b;
        if (animator.equals(chatActivityEnterView.f24025t2)) {
            chatActivityEnterView.f24025t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23976k1.setAlpha(1.0f);
        chatActivityEnterView.f23976k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f23942e4 = true;
            chatActivityEnterView2.f23949f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f30982a) {
            dl0 dl0Var = chatActivityEnterView.f23958h1;
            if (dl0Var != null) {
                dl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f23939e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
