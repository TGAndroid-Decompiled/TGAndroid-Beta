package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig extends AnimatorListenerAdapter {
    public final int f27109a;
    public final int f27110b;
    public final ChatActivityEnterView f27111c;

    public ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27109a = i11;
        this.f27111c = chatActivityEnterView;
        this.f27110b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27109a) {
            case 0:
                int i10 = this.f27110b;
                ChatActivityEnterView chatActivityEnterView = this.f27111c;
                if (i10 == 0) {
                    chatActivityEnterView.f23806z2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27111c;
                ov0 ov0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f23807z3 = false;
                chatActivityEnterView2.A3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.f23681c5 == null) {
                        egVar.getLayoutParams().height = this.f27110b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ov0Var != null) {
                    ov0Var.requestLayout();
                    ov0Var.setForeground(null);
                    ov0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23802y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f23691e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f23761r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f23761r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
