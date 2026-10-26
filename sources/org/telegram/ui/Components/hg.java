package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f28962a;
    public final int f28963b;
    public final ChatActivityEnterView f28964c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28962a = i11;
        this.f28964c = chatActivityEnterView;
        this.f28963b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28962a) {
            case 0:
                int i10 = this.f28963b;
                ChatActivityEnterView chatActivityEnterView = this.f28964c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28964c;
                vw0 vw0Var = chatActivityEnterView2.f25917m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f25894h5 == null) {
                        dgVar.getLayoutParams().height = this.f28963b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (vw0Var != null) {
                    vw0Var.requestLayout();
                    vw0Var.setForeground(null);
                    vw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f25992z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f25879f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f25947r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f25947r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
