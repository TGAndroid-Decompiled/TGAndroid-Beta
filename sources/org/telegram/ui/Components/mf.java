package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final int f28467a;
    public final int f28468b;
    public final ChatActivityEnterView f28469c;

    public mf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28467a = i11;
        this.f28469c = chatActivityEnterView;
        this.f28468b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28467a) {
            case 0:
                int i10 = this.f28468b;
                ChatActivityEnterView chatActivityEnterView = this.f28469c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.e();
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28469c;
                vu0 vu0Var = chatActivityEnterView2.f23747m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gf gfVar = chatActivityEnterView2.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView2.f23724h5 == null) {
                        gfVar.getLayoutParams().height = this.f28468b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (vu0Var != null) {
                    vu0Var.requestLayout();
                    vu0Var.setForeground(null);
                    vu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23823z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23709f2, true, true);
                }
                ld ldVar = chatActivityEnterView2.f23777r0;
                if (ldVar != null) {
                    ldVar.run();
                    chatActivityEnterView2.f23777r0 = null;
                }
                chatActivityEnterView2.L3.e();
                return;
        }
    }
}
