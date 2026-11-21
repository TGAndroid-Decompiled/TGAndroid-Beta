package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf extends AnimatorListenerAdapter {
    public final boolean f40814a;
    public final ChatActivityEnterView f40815b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f40815b = chatActivityEnterView;
        this.f40814a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40815b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.W0();
        float f10 = 1.0f;
        chatActivityEnterView.f32570a2.setAlpha(1.0f);
        chatActivityEnterView.f32570a2.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.E2;
        if (rgVar != null && org.telegram.messenger.bz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.Q0;
            chatActivityEnterView2.U4 = true;
            chatActivityEnterView2.V4 = System.currentTimeMillis();
        }
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            if (!chatActivityEnterView.i0()) {
                f10 = 0.0f;
            }
            gfVar.setAlpha(f10);
        }
        if (this.f40814a) {
            zi0 zi0Var = chatActivityEnterView.f32635i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.f32612f1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.W0();
        }
    }
}
