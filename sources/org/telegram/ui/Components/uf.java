package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f33384a;
    public final ChatActivityEnterView f33385b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f33385b = chatActivityEnterView;
        this.f33384a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33385b;
        if (animator.equals(chatActivityEnterView.f25962t2)) {
            chatActivityEnterView.f25962t2 = null;
        }
        chatActivityEnterView.t0();
        chatActivityEnterView.f25910k1.setAlpha(1.0f);
        chatActivityEnterView.f25910k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.f32583b0;
            chatActivityEnterView2.f25876e4 = true;
            chatActivityEnterView2.f25883f4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f33384a) {
            hl0 hl0Var = chatActivityEnterView.f25892h1;
            if (hl0Var != null) {
                hl0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f25873e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.t0();
        }
    }
}
