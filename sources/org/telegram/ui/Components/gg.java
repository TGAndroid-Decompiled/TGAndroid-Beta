package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg extends AnimatorListenerAdapter {
    public final int f24206a;
    public final int f24207b;
    public final ChatActivityEnterView f24208c;

    public gg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24206a = i11;
        this.f24208c = chatActivityEnterView;
        this.f24207b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24206a) {
            case 0:
                int i10 = this.f24207b;
                ChatActivityEnterView chatActivityEnterView = this.f24208c;
                if (i10 == 0) {
                    chatActivityEnterView.f21885z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24208c;
                qv0 qv0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f21886z3 = false;
                chatActivityEnterView2.A3 = null;
                cg cgVar = chatActivityEnterView2.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView2.f21761c5 == null) {
                        cgVar.getLayoutParams().height = this.f24207b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (qv0Var != null) {
                    qv0Var.requestLayout();
                    qv0Var.setForeground(null);
                    qv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f21881y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f21770e2, true, true);
                }
                ge geVar = chatActivityEnterView2.f21840r0;
                if (geVar != null) {
                    geVar.run();
                    chatActivityEnterView2.f21840r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
