package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f33383a;
    public final ChatActivityEnterView f33384b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f33384b = chatActivityEnterView;
        this.f33383a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33384b;
        if (animator.equals(chatActivityEnterView.f25958t2)) {
            chatActivityEnterView.f25958t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f25906k1.setAlpha(1.0f);
        chatActivityEnterView.f25906k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.f32542b0;
            chatActivityEnterView2.f25872e4 = true;
            chatActivityEnterView2.f25879f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f33383a) {
            gl0 gl0Var = chatActivityEnterView.f25888h1;
            if (gl0Var != null) {
                gl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f25869e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
