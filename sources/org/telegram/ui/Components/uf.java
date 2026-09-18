package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f28683a;
    public final ChatActivityEnterView f28684b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28684b = chatActivityEnterView;
        this.f28683a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28684b;
        if (animator.equals(chatActivityEnterView.f22024s2)) {
            chatActivityEnterView.f22024s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f21976j1.setAlpha(1.0f);
        chatActivityEnterView.f21976j1.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.N1;
        if (rgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.V;
            chatActivityEnterView2.f21942d4 = true;
            chatActivityEnterView2.f21948e4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.f28683a) {
            rk0 rk0Var = chatActivityEnterView.f21964h1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.f21945e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
