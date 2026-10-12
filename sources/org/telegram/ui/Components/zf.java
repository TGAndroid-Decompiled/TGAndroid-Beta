package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f33347a;
    public final ChatActivityEnterView f33348b;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f33348b = chatActivityEnterView;
        this.f33347a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f33348b;
        if (animator.equals(chatActivityEnterView.f23735t2)) {
            chatActivityEnterView.f23735t2 = null;
        }
        chatActivityEnterView.z0();
        chatActivityEnterView.f23681k1.setAlpha(1.0f);
        chatActivityEnterView.f23681k1.setTranslationX(0.0f);
        wg wgVar = chatActivityEnterView.O1;
        if (wgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = wgVar.f32382g0;
            chatActivityEnterView2.H4 = true;
            chatActivityEnterView2.I4 = System.currentTimeMillis();
        }
        uf ufVar = chatActivityEnterView.E0;
        if (ufVar != null) {
            ufVar.setAlpha(0.0f);
        }
        if (this.f33347a) {
            ol0 ol0Var = chatActivityEnterView.f23664h1;
            if (ol0Var != null) {
                ol0Var.setVisibility(8);
            }
            ne neVar = chatActivityEnterView.f23645e1;
            if (neVar != null) {
                neVar.setVisibility(8);
            }
            chatActivityEnterView.z0();
        }
    }
}
