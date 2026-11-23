package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf extends AnimatorListenerAdapter {
    public final boolean f40365a;
    public final ChatActivityEnterView f40366b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.f40366b = chatActivityEnterView;
        this.f40365a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.f40366b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.X0();
        float f10 = 1.0f;
        chatActivityEnterView.f32637a2.setAlpha(1.0f);
        chatActivityEnterView.f32637a2.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.E2;
        if (qgVar != null && org.telegram.messenger.bz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.Q0;
            chatActivityEnterView2.U4 = true;
            chatActivityEnterView2.V4 = System.currentTimeMillis();
        }
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar != null) {
            if (!chatActivityEnterView.i0()) {
                f10 = 0.0f;
            }
            hfVar.setAlpha(f10);
        }
        if (this.f40365a) {
            zi0 zi0Var = chatActivityEnterView.f32702i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            ee eeVar = chatActivityEnterView.f32679f1;
            if (eeVar != null) {
                eeVar.setVisibility(8);
            }
            chatActivityEnterView.X0();
        }
    }
}
