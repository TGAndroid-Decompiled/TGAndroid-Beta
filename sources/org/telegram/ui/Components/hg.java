package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f24673a;
    public final int f24674b;
    public final ChatActivityEnterView f24675c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24673a = i11;
        this.f24675c = chatActivityEnterView;
        this.f24674b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24673a) {
            case 0:
                int i10 = this.f24674b;
                ChatActivityEnterView chatActivityEnterView = this.f24675c;
                if (i10 == 0) {
                    chatActivityEnterView.f22061z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f24675c;
                bw0 bw0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f22062z3 = false;
                chatActivityEnterView2.A3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f21937c5 == null) {
                        dgVar.getLayoutParams().height = this.f24674b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (bw0Var != null) {
                    bw0Var.requestLayout();
                    bw0Var.setForeground(null);
                    bw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22057y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f21946e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f22016r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f22016r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
