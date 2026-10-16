package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f25991a;
    public final int f25992b;
    public final ChatActivityEnterView f25993c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25991a = i11;
        this.f25993c = chatActivityEnterView;
        this.f25992b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25991a) {
            case 0:
                int i10 = this.f25992b;
                ChatActivityEnterView chatActivityEnterView = this.f25993c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.A(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25993c;
                ow0 ow0Var = chatActivityEnterView2.f22623m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f22575d5 == null) {
                        fgVar.getLayoutParams().height = this.f25992b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ow0Var != null) {
                    ow0Var.requestLayout();
                    ow0Var.setForeground(null);
                    ow0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22695z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f22585f2, true, true);
                }
                je jeVar = chatActivityEnterView2.f22650r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.f22650r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
