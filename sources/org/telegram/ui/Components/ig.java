package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f25088a;
    public final int f25089b;
    public final ChatActivityEnterView f25090c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25088a = i11;
        this.f25090c = chatActivityEnterView;
        this.f25089b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25088a) {
            case 0:
                int i10 = this.f25089b;
                ChatActivityEnterView chatActivityEnterView = this.f25090c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f25090c;
                bw0 bw0Var = chatActivityEnterView2.f22025m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f21978d5 == null) {
                        egVar.getLayoutParams().height = this.f25089b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (bw0Var != null) {
                    bw0Var.requestLayout();
                    bw0Var.setForeground(null);
                    bw0Var.setWillNotDraw(false);
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
