package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f24818a;
    public final int f24819b;
    public final ChatActivityEnterView f24820c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24818a = i11;
        this.f24820c = chatActivityEnterView;
        this.f24819b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24818a) {
            case 0:
                int i10 = this.f24819b;
                ChatActivityEnterView chatActivityEnterView = this.f24820c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                ng ngVar = chatActivityEnterView.Z2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24820c;
                cw0 cw0Var = chatActivityEnterView2.f22040m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f21993d5 == null) {
                        dgVar.getLayoutParams().height = this.f24819b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (cw0Var != null) {
                    cw0Var.requestLayout();
                    cw0Var.setForeground(null);
                    cw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22112z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f22003f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f22067r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f22067r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
