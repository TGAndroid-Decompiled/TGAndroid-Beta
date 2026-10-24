package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg extends AnimatorListenerAdapter {
    public final int f26318a;
    public final int f26319b;
    public final ChatActivityEnterView f26320c;

    public fg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f26318a = i11;
        this.f26320c = chatActivityEnterView;
        this.f26319b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26318a) {
            case 0:
                int i10 = this.f26319b;
                ChatActivityEnterView chatActivityEnterView = this.f26320c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    mgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26320c;
                nw0 nw0Var = chatActivityEnterView2.f24125m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                bg bgVar = chatActivityEnterView2.U0;
                if (bgVar != null) {
                    if (chatActivityEnterView2.f24102h5 == null) {
                        bgVar.getLayoutParams().height = this.f26319b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (nw0Var != null) {
                    nw0Var.requestLayout();
                    nw0Var.setForeground(null);
                    nw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24200z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f24087f2, true, true);
                }
                ge geVar = chatActivityEnterView2.f24155r0;
                if (geVar != null) {
                    geVar.run();
                    chatActivityEnterView2.f24155r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
