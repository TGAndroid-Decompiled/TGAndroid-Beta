package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f24671a;
    public final int f24672b;
    public final ChatActivityEnterView f24673c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24671a = i11;
        this.f24673c = chatActivityEnterView;
        this.f24672b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24671a) {
            case 0:
                int i10 = this.f24672b;
                ChatActivityEnterView chatActivityEnterView = this.f24673c;
                if (i10 == 0) {
                    chatActivityEnterView.f21846z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24673c;
                pv0 pv0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f21847z3 = false;
                chatActivityEnterView2.A3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f21727d5 == null) {
                        dgVar.getLayoutParams().height = this.f24672b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (pv0Var != null) {
                    pv0Var.requestLayout();
                    pv0Var.setForeground(null);
                    pv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f21842y2 && chatActivityEnterView2.u0()) {
                    chatActivityEnterView2.u1(0, chatActivityEnterView2.f21730e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f21801r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f21801r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
