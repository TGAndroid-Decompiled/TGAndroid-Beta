package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f29900a;
    public final ChatActivityEnterView f29901b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f29901b = chatActivityEnterView;
        this.f29900a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29901b;
        if (animator.equals(chatActivityEnterView.f22087t2)) {
            chatActivityEnterView.f22087t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22038k1.setAlpha(1.0f);
        chatActivityEnterView.f22038k1.setTranslationX(0.0f);
        tg tgVar = chatActivityEnterView.O1;
        if (tgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = tgVar.V;
            chatActivityEnterView2.f22005e4 = true;
            chatActivityEnterView2.f22012f4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f29900a) {
            uk0 uk0Var = chatActivityEnterView.f22021h1;
            if (uk0Var != null) {
                uk0Var.setVisibility(8);
            }
            me meVar = chatActivityEnterView.f22002e1;
            if (meVar != null) {
                meVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
