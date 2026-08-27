package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

public final class gf extends AnimatorListenerAdapter {

    public final boolean f28612a;

    public final ChatActivityEnterView f28613b;

    public gf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28613b = chatActivityEnterView;
        this.f28612a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28613b;
        if (animator.equals(chatActivityEnterView.f26153o2)) {
            chatActivityEnterView.f26153o2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f26105f1.setAlpha(1.0f);
        chatActivityEnterView.f26105f1.setTranslationX(0.0f);
        eg egVar = chatActivityEnterView.J1;
        if (egVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = egVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.f26074a4 = System.currentTimeMillis();
        }
        bf bfVar = chatActivityEnterView.A0;
        if (bfVar != null) {
            bfVar.setAlpha(0.0f);
        }
        if (this.f28612a) {
            xj0 xj0Var = chatActivityEnterView.f26091d1;
            if (xj0Var != null) {
                xj0Var.setVisibility(8);
            }
            wd wdVar = chatActivityEnterView.f26073a1;
            if (wdVar != null) {
                wdVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
