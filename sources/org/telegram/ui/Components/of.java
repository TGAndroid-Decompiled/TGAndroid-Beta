package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class of extends AnimatorListenerAdapter {
    public final boolean f31340a;
    public final ChatActivityEnterView f31341b;

    public of(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f31341b = chatActivityEnterView;
        this.f31340a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f31341b;
        if (animator.equals(chatActivityEnterView.f26168o2)) {
            chatActivityEnterView.f26168o2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f26120f1.setAlpha(1.0f);
        chatActivityEnterView.f26120f1.setTranslationX(0.0f);
        lg lgVar = chatActivityEnterView.J1;
        if (lgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lgVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.f26090a4 = System.currentTimeMillis();
        }
        jf jfVar = chatActivityEnterView.A0;
        if (jfVar != null) {
            jfVar.setAlpha(0.0f);
        }
        if (this.f31340a) {
            gk0 gk0Var = chatActivityEnterView.f26106d1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.f26088a1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
