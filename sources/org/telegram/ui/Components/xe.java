package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe extends AnimatorListenerAdapter {
    public final boolean f32540a;
    public final ChatActivityEnterView f32541b;

    public xe(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32541b = chatActivityEnterView;
        this.f32540a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32541b;
        if (animator.equals(chatActivityEnterView.f23791t2)) {
            chatActivityEnterView.f23791t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f23738k1.setAlpha(1.0f);
        chatActivityEnterView.f23738k1.setTranslationX(0.0f);
        wf wfVar = chatActivityEnterView.O1;
        if (wfVar != null && org.telegram.messenger.uz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = wfVar.f32228b0;
            chatActivityEnterView2.f23704e4 = true;
            chatActivityEnterView2.f23711f4 = System.currentTimeMillis();
        }
        se seVar = chatActivityEnterView.E0;
        if (seVar != null) {
            seVar.setAlpha(0.0f);
        }
        if (this.f32540a) {
            oj0 oj0Var = chatActivityEnterView.f23720h1;
            if (oj0Var != null) {
                oj0Var.setVisibility(8);
            }
            pd pdVar = chatActivityEnterView.f23701e1;
            if (pdVar != null) {
                pdVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
