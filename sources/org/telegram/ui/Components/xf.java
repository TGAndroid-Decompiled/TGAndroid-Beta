package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class xf extends AnimatorListenerAdapter {
    public final boolean f32881a;
    public final ChatActivityEnterView f32882b;

    public xf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32882b = chatActivityEnterView;
        this.f32881a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32882b;
        if (animator.equals(chatActivityEnterView.f23956t2)) {
            chatActivityEnterView.f23956t2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.f23907k1.setAlpha(1.0f);
        chatActivityEnterView.f23907k1.setTranslationX(0.0f);
        ug ugVar = chatActivityEnterView.O1;
        if (ugVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = ugVar.V;
            chatActivityEnterView2.f23874e4 = true;
            chatActivityEnterView2.f23881f4 = System.currentTimeMillis();
        }
        sf sfVar = chatActivityEnterView.E0;
        if (sfVar != null) {
            sfVar.setAlpha(0.0f);
        }
        if (this.f32881a) {
            nl0 nl0Var = chatActivityEnterView.f23890h1;
            if (nl0Var != null) {
                nl0Var.setVisibility(8);
            }
            ne neVar = chatActivityEnterView.f23871e1;
            if (neVar != null) {
                neVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}
