package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg extends AnimatorListenerAdapter {
    public final int f24337a;
    public final int f24338b;
    public final ChatActivityEnterView f24339c;

    public gg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24337a = i11;
        this.f24339c = chatActivityEnterView;
        this.f24338b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24337a) {
            case 0:
                int i10 = this.f24338b;
                ChatActivityEnterView chatActivityEnterView = this.f24339c;
                if (i10 == 0) {
                    chatActivityEnterView.f21875z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f24339c;
                pv0 pv0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f21876z3 = false;
                chatActivityEnterView2.A3 = null;
                cg cgVar = chatActivityEnterView2.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView2.f21751c5 == null) {
                        cgVar.getLayoutParams().height = this.f24338b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (pv0Var != null) {
                    pv0Var.requestLayout();
                    pv0Var.setForeground(null);
                    pv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f21871y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f21760e2, true, true);
                }
                ge geVar = chatActivityEnterView2.f21830r0;
                if (geVar != null) {
                    geVar.run();
                    chatActivityEnterView2.f21830r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
