package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class vf extends AnimatorListenerAdapter {
    public final boolean f31210a;
    public final ChatActivityEnterView f31211b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f31211b = chatActivityEnterView;
        this.f31210a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31211b;
        if (animator.equals(chatActivityEnterView.f23770s2)) {
            chatActivityEnterView.f23770s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f23722j1.setAlpha(1.0f);
        chatActivityEnterView.f23722j1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.N1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f23687d4 = true;
            chatActivityEnterView2.f23694e4 = System.currentTimeMillis();
        }
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setAlpha(0.0f);
        }
        if (this.f31210a) {
            gk0 gk0Var = chatActivityEnterView.f23710h1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f23691e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
