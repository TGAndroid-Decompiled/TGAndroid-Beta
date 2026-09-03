package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class lf extends AnimatorListenerAdapter {
    public final boolean f26649a;
    public final ChatActivityEnterView f26650b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z4) {
        this.f26650b = chatActivityEnterView;
        this.f26649a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f26650b;
        if (animator.equals(chatActivityEnterView.f22790p2)) {
            chatActivityEnterView.f22790p2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22742g1.setAlpha(1.0f);
        chatActivityEnterView.f22742g1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.K1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.S;
            chatActivityEnterView2.f22707a4 = true;
            chatActivityEnterView2.f22714b4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.f26649a) {
            qk0 qk0Var = chatActivityEnterView.f22729e1;
            if (qk0Var != null) {
                qk0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.f22711b1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
