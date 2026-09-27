package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f25125a;
    public final int f25126b;
    public final ChatActivityEnterView f25127c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25125a = i11;
        this.f25127c = chatActivityEnterView;
        this.f25126b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25125a) {
            case 0:
                int i10 = this.f25126b;
                ChatActivityEnterView chatActivityEnterView = this.f25127c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f25127c;
                cw0 cw0Var = chatActivityEnterView2.f22028m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f21981d5 == null) {
                        egVar.getLayoutParams().height = this.f25126b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (cw0Var != null) {
                    cw0Var.requestLayout();
                    cw0Var.setForeground(null);
                    cw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22100z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f21991f2, true, true);
                }
                je jeVar = chatActivityEnterView2.f22055r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.f22055r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
