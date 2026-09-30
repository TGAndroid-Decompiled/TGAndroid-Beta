package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class vf extends AnimatorListenerAdapter {
    public final boolean f29044a;
    public final ChatActivityEnterView f29045b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f29045b = chatActivityEnterView;
        this.f29044a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f29045b;
        if (animator.equals(chatActivityEnterView.f22067t2)) {
            chatActivityEnterView.f22067t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f22018k1.setAlpha(1.0f);
        chatActivityEnterView.f22018k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.f21985e4 = true;
            chatActivityEnterView2.f21992f4 = System.currentTimeMillis();
        }
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setAlpha(0.0f);
        }
        if (this.f29044a) {
            tk0 tk0Var = chatActivityEnterView.f22001h1;
            if (tk0Var != null) {
                tk0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f21982e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
