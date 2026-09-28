package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f25104a;
    public final int f25105b;
    public final ChatActivityEnterView f25106c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25104a = i11;
        this.f25106c = chatActivityEnterView;
        this.f25105b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25104a) {
            case 0:
                int i10 = this.f25105b;
                ChatActivityEnterView chatActivityEnterView = this.f25106c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25106c;
                cw0 cw0Var = chatActivityEnterView2.f22025m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f21978d5 == null) {
                        egVar.getLayoutParams().height = this.f25105b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (cw0Var != null) {
                    cw0Var.requestLayout();
                    cw0Var.setForeground(null);
                    cw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22097z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f21988f2, true, true);
                }
                je jeVar = chatActivityEnterView2.f22052r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.f22052r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
