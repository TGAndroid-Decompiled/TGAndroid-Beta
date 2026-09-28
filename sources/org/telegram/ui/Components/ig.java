package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f25105a;
    public final int f25106b;
    public final ChatActivityEnterView f25107c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25105a = i11;
        this.f25107c = chatActivityEnterView;
        this.f25106b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25105a) {
            case 0:
                int i10 = this.f25106b;
                ChatActivityEnterView chatActivityEnterView = this.f25107c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f25107c;
                cw0 cw0Var = chatActivityEnterView2.f22026m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f21979d5 == null) {
                        egVar.getLayoutParams().height = this.f25106b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (cw0Var != null) {
                    cw0Var.requestLayout();
                    cw0Var.setForeground(null);
                    cw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22098z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f21989f2, true, true);
                }
                je jeVar = chatActivityEnterView2.f22053r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.f22053r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
