package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f30948a;
    public final ChatActivityEnterView f30949b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f30949b = chatActivityEnterView;
        this.f30948a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f30949b;
        if (animator.equals(chatActivityEnterView.f24019t2)) {
            chatActivityEnterView.f24019t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23970k1.setAlpha(1.0f);
        chatActivityEnterView.f23970k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f23936e4 = true;
            chatActivityEnterView2.f23943f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f30948a) {
            dl0 dl0Var = chatActivityEnterView.f23952h1;
            if (dl0Var != null) {
                dl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f23933e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
