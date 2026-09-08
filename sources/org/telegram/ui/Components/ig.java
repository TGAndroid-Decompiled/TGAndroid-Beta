package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f27136a;
    public final int f27137b;
    public final ChatActivityEnterView f27138c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27136a = i11;
        this.f27138c = chatActivityEnterView;
        this.f27137b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27136a) {
            case 0:
                int i10 = this.f27137b;
                ChatActivityEnterView chatActivityEnterView = this.f27138c;
                if (i10 == 0) {
                    chatActivityEnterView.f23833z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27138c;
                ov0 ov0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f23834z3 = false;
                chatActivityEnterView2.A3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f23708c5 == null) {
                        egVar.getLayoutParams().height = this.f27137b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ov0Var != null) {
                    ov0Var.requestLayout();
                    ov0Var.setForeground(null);
                    ov0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23829y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f23718e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f23788r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f23788r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
