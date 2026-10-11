package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class xf extends AnimatorListenerAdapter {
    public final boolean f32954a;
    public final ChatActivityEnterView f32955b;

    public xf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32955b = chatActivityEnterView;
        this.f32954a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32955b;
        if (animator.equals(chatActivityEnterView.f23992t2)) {
            chatActivityEnterView.f23992t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23943k1.setAlpha(1.0f);
        chatActivityEnterView.f23943k1.setTranslationX(0.0f);
        ug ugVar = chatActivityEnterView.O1;
        if (ugVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = ugVar.V;
            chatActivityEnterView2.f23910e4 = true;
            chatActivityEnterView2.f23917f4 = System.currentTimeMillis();
        }
        sf sfVar = chatActivityEnterView.E0;
        if (sfVar != null) {
            sfVar.setAlpha(0.0f);
        }
        if (this.f32954a) {
            ml0 ml0Var = chatActivityEnterView.f23926h1;
            if (ml0Var != null) {
                ml0Var.setVisibility(8);
            }
            ne neVar = chatActivityEnterView.f23907e1;
            if (neVar != null) {
                neVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
