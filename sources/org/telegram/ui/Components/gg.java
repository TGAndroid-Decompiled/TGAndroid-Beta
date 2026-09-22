package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg extends AnimatorListenerAdapter {
    public final int f24334a;
    public final int f24335b;
    public final ChatActivityEnterView f24336c;

    public gg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24334a = i11;
        this.f24336c = chatActivityEnterView;
        this.f24335b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24334a) {
            case 0:
                int i10 = this.f24335b;
                ChatActivityEnterView chatActivityEnterView = this.f24336c;
                if (i10 == 0) {
                    chatActivityEnterView.f21872z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f24336c;
                pv0 pv0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f21873z3 = false;
                chatActivityEnterView2.A3 = null;
                cg cgVar = chatActivityEnterView2.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView2.f21753d5 == null) {
                        cgVar.getLayoutParams().height = this.f24335b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (pv0Var != null) {
                    pv0Var.requestLayout();
                    pv0Var.setForeground(null);
                    pv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f21868y2 && chatActivityEnterView2.u0()) {
                    chatActivityEnterView2.u1(0, chatActivityEnterView2.f21756e2, true, true);
                }
                ge geVar = chatActivityEnterView2.f21827r0;
                if (geVar != null) {
                    geVar.run();
                    chatActivityEnterView2.f21827r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
