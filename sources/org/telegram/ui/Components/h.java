package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h extends AnimatorListenerAdapter {
    public final boolean a;
    public final ChatActivityEnterView b;

    public h(ChatActivityEnterView chatActivityEnterView, boolean z) {
        this.b = chatActivityEnterView;
        this.a = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.i3)) {
            chatActivityEnterView.i3 = null;
        }
        chatActivityEnterView.Y0();
        float f = 1.0f;
        chatActivityEnterView.Z1.setAlpha(1.0f);
        chatActivityEnterView.Z1.setTranslationX(0.0f);
        l lVar = chatActivityEnterView.D2;
        if (lVar != null && xea.N < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lVar.U0;
            chatActivityEnterView2.S4 = true;
            chatActivityEnterView2.T4 = System.currentTimeMillis();
        }
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var != null) {
            if (!chatActivityEnterView.j0()) {
                f = 0.0f;
            }
            tx1Var.setAlpha(f);
        }
        if (this.a) {
            x59 x59Var = chatActivityEnterView.i1;
            if (x59Var != null) {
                x59Var.setVisibility(8);
            }
            rw1 rw1Var = chatActivityEnterView.f1;
            if (rw1Var != null) {
                rw1Var.setVisibility(8);
            }
            chatActivityEnterView.Y0();
        }
    }
}
