package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f32611a;
    public final ChatActivityEnterView f32612b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32612b = chatActivityEnterView;
        this.f32611a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32612b;
        if (animator.equals(chatActivityEnterView.f23968t2)) {
            chatActivityEnterView.f23968t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f23919k1.setAlpha(1.0f);
        chatActivityEnterView.f23919k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f23886e4 = true;
            chatActivityEnterView2.f23893f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f32611a) {
            tk0 tk0Var = chatActivityEnterView.f23902h1;
            if (tk0Var != null) {
                tk0Var.setVisibility(8);
            }
            me meVar = chatActivityEnterView.f23883e1;
            if (meVar != null) {
                meVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
