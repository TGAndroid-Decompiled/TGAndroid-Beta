package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class wf extends AnimatorListenerAdapter {
    public final boolean f28762a;
    public final ChatActivityEnterView f28763b;

    public wf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f28763b = chatActivityEnterView;
        this.f28762a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f28763b;
        if (animator.equals(chatActivityEnterView.f20923s2)) {
            chatActivityEnterView.f20923s2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f20875j1.setAlpha(1.0f);
        chatActivityEnterView.f20875j1.setTranslationX(0.0f);
        ug ugVar = chatActivityEnterView.N1;
        if (ugVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = ugVar.V;
            chatActivityEnterView2.f20841d4 = true;
            chatActivityEnterView2.f20847e4 = System.currentTimeMillis();
        }
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setAlpha(0.0f);
        }
        if (this.f28762a) {
            qk0 qk0Var = chatActivityEnterView.f20863h1;
            if (qk0Var != null) {
                qk0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.f20844e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
