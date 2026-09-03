package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class lf extends AnimatorListenerAdapter {
    public final boolean f28727a;
    public final ChatActivityEnterView f28728b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z4) {
        this.f28728b = chatActivityEnterView;
        this.f28727a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28728b;
        if (animator.equals(chatActivityEnterView.f24659p2)) {
            chatActivityEnterView.f24659p2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f24611g1.setAlpha(1.0f);
        chatActivityEnterView.f24611g1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.K1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.S;
            chatActivityEnterView2.f24575a4 = true;
            chatActivityEnterView2.f24582b4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.f28727a) {
            rk0 rk0Var = chatActivityEnterView.f24598e1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.f24579b1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
