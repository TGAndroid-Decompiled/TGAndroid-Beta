package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f33386a;
    public final ChatActivityEnterView f33387b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f33387b = chatActivityEnterView;
        this.f33386a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33387b;
        if (animator.equals(chatActivityEnterView.f25960t2)) {
            chatActivityEnterView.f25960t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f25908k1.setAlpha(1.0f);
        chatActivityEnterView.f25908k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.f32544b0;
            chatActivityEnterView2.f25874e4 = true;
            chatActivityEnterView2.f25881f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f33386a) {
            gl0 gl0Var = chatActivityEnterView.f25890h1;
            if (gl0Var != null) {
                gl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f25871e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
