package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f27137a;
    public final int f27138b;
    public final ChatActivityEnterView f27139c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27137a = i11;
        this.f27139c = chatActivityEnterView;
        this.f27138b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27137a) {
            case 0:
                int i10 = this.f27138b;
                ChatActivityEnterView chatActivityEnterView = this.f27139c;
                if (i10 == 0) {
                    chatActivityEnterView.f23834z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27139c;
                ov0 ov0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f23835z3 = false;
                chatActivityEnterView2.A3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f23709c5 == null) {
                        egVar.getLayoutParams().height = this.f27138b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ov0Var != null) {
                    ov0Var.requestLayout();
                    ov0Var.setForeground(null);
                    ov0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23830y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f23719e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f23789r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f23789r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
