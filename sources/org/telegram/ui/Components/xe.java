package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe extends AnimatorListenerAdapter {
    public final boolean f32461a;
    public final ChatActivityEnterView f32462b;

    public xe(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f32462b = chatActivityEnterView;
        this.f32461a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f32462b;
        if (animator.equals(chatActivityEnterView.f23790t2)) {
            chatActivityEnterView.f23790t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.f23737k1.setAlpha(1.0f);
        chatActivityEnterView.f23737k1.setTranslationX(0.0f);
        wf wfVar = chatActivityEnterView.O1;
        if (wfVar != null && org.telegram.messenger.tz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = wfVar.f32162b0;
            chatActivityEnterView2.f23703e4 = true;
            chatActivityEnterView2.f23710f4 = System.currentTimeMillis();
        }
        se seVar = chatActivityEnterView.E0;
        if (seVar != null) {
            seVar.setAlpha(0.0f);
        }
        if (this.f32461a) {
            nj0 nj0Var = chatActivityEnterView.f23719h1;
            if (nj0Var != null) {
                nj0Var.setVisibility(8);
            }
            pd pdVar = chatActivityEnterView.f23700e1;
            if (pdVar != null) {
                pdVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}
