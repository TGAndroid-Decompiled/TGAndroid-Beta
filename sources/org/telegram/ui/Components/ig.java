package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f25049a;
    public final int f25050b;
    public final ChatActivityEnterView f25051c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25049a = i11;
        this.f25051c = chatActivityEnterView;
        this.f25050b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25049a) {
            case 0:
                int i10 = this.f25050b;
                ChatActivityEnterView chatActivityEnterView = this.f25051c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f25051c;
                aw0 aw0Var = chatActivityEnterView2.f22026m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f21979d5 == null) {
                        egVar.getLayoutParams().height = this.f25050b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (aw0Var != null) {
                    aw0Var.requestLayout();
                    aw0Var.setForeground(null);
                    aw0Var.setWillNotDraw(false);
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
