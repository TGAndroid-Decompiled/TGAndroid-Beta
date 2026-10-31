package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf extends AnimatorListenerAdapter {
    public final int f28430a;
    public final int f28431b;
    public final ChatActivityEnterView f28432c;

    public mf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28430a = i11;
        this.f28432c = chatActivityEnterView;
        this.f28431b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28430a) {
            case 0:
                int i10 = this.f28431b;
                ChatActivityEnterView chatActivityEnterView = this.f28432c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f28432c;
                uu0 uu0Var = chatActivityEnterView2.f23746m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gf gfVar = chatActivityEnterView2.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView2.f23723h5 == null) {
                        gfVar.getLayoutParams().height = this.f28431b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (uu0Var != null) {
                    uu0Var.requestLayout();
                    uu0Var.setForeground(null);
                    uu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23822z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23708f2, true, true);
                }
                ld ldVar = chatActivityEnterView2.f23776r0;
                if (ldVar != null) {
                    ldVar.run();
                    chatActivityEnterView2.f23776r0 = null;
                }
                chatActivityEnterView2.L3.e();
                return;
        }
    }
}
