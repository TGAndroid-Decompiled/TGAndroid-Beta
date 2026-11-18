package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f39988a;
    public final ChatActivityEnterView f39989b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f39989b = chatActivityEnterView;
        this.f39988a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f39989b;
        if (animator.equals(chatActivityEnterView.f32602h3)) {
            chatActivityEnterView.f32602h3 = null;
        }
        chatActivityEnterView.S0();
        float f10 = 1.0f;
        chatActivityEnterView.Y1.setAlpha(1.0f);
        chatActivityEnterView.Y1.setTranslationX(0.0f);
        pg pgVar = chatActivityEnterView.C2;
        if (pgVar != null && org.telegram.messenger.bz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = pgVar.Q0;
            chatActivityEnterView2.S4 = true;
            chatActivityEnterView2.T4 = System.currentTimeMillis();
        }
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            if (!chatActivityEnterView.l1) {
                f10 = 0.0f;
            }
            gfVar.setAlpha(f10);
        }
        if (this.f39988a) {
            xi0 xi0Var = chatActivityEnterView.f32607i1;
            if (xi0Var != null) {
                xi0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.f32584f1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.S0();
        }
    }
}
