package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f27110a;
    public final int f27111b;
    public final ChatActivityEnterView f27112c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27110a = i11;
        this.f27112c = chatActivityEnterView;
        this.f27111b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27110a) {
            case 0:
                int i10 = this.f27111b;
                ChatActivityEnterView chatActivityEnterView = this.f27112c;
                if (i10 == 0) {
                    chatActivityEnterView.f23807z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27112c;
                ov0 ov0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f23808z3 = false;
                chatActivityEnterView2.A3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f23682c5 == null) {
                        egVar.getLayoutParams().height = this.f27111b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ov0Var != null) {
                    ov0Var.requestLayout();
                    ov0Var.setForeground(null);
                    ov0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23803y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f23692e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f23762r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f23762r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
