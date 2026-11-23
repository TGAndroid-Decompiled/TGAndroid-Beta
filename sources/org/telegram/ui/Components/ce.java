package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ce extends AnimatorListenerAdapter {
    public final int f34029a;
    public final int f34030b;
    public final ChatActivityEnterView f34031c;

    public ce(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f34029a = i10;
        this.f34031c = chatActivityEnterView;
        this.f34030b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34029a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34031c;
                cu0 cu0Var = chatActivityEnterView.f32655c2;
                chatActivityEnterView.f32764q4 = false;
                chatActivityEnterView.f32773r4 = null;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.f32676e7 == null) {
                        egVar.getLayoutParams().height = this.f34030b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (cu0Var != null) {
                    cu0Var.requestLayout();
                    cu0Var.setForeground(null);
                    cu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32755p3 && chatActivityEnterView.T0()) {
                    chatActivityEnterView.Z1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.f32778s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.f32778s0 = null;
                }
                chatActivityEnterView.B4.e();
                return;
            default:
                int i7 = this.f34030b;
                ChatActivityEnterView chatActivityEnterView2 = this.f34031c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32763q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32815x2.setTranslationY(0.0f);
                chatActivityEnterView2.f32815x2.setVisibility(8);
                chatActivityEnterView2.B4.e();
                mg mgVar = chatActivityEnterView2.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                return;
        }
    }
}
