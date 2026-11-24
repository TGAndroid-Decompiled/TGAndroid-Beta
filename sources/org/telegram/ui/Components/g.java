package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final boolean a;
    public final ChatActivityEnterView b;

    public g(ChatActivityEnterView chatActivityEnterView, boolean z) {
        this.b = chatActivityEnterView;
        this.a = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.U0();
        float f = 1.0f;
        chatActivityEnterView.a2.setAlpha(1.0f);
        chatActivityEnterView.a2.setTranslationX(0.0f);
        l lVar = chatActivityEnterView.E2;
        if (lVar != null && gba.N < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lVar.Q0;
            chatActivityEnterView2.T4 = true;
            chatActivityEnterView2.U4 = System.currentTimeMillis();
        }
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var != null) {
            if (!chatActivityEnterView.g0()) {
                f = 0.0f;
            }
            ex1Var.setAlpha(f);
        }
        if (this.a) {
            i29 i29Var = chatActivityEnterView.i1;
            if (i29Var != null) {
                i29Var.setVisibility(8);
            }
            cw1 cw1Var = chatActivityEnterView.f1;
            if (cw1Var != null) {
                cw1Var.setVisibility(8);
            }
            chatActivityEnterView.U0();
        }
    }
}
