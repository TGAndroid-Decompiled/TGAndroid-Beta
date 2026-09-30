package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f25442a;
    public final int f25443b;
    public final ChatActivityEnterView f25444c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f25442a = i11;
        this.f25444c = chatActivityEnterView;
        this.f25443b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25442a) {
            case 0:
                int i10 = this.f25443b;
                ChatActivityEnterView chatActivityEnterView = this.f25444c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25444c;
                dw0 dw0Var = chatActivityEnterView2.f22047m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f22000d5 == null) {
                        fgVar.getLayoutParams().height = this.f25443b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (dw0Var != null) {
                    dw0Var.requestLayout();
                    dw0Var.setForeground(null);
                    dw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22119z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f22010f2, true, true);
                }
                ke keVar = chatActivityEnterView2.f22074r0;
                if (keVar != null) {
                    keVar.run();
                    chatActivityEnterView2.f22074r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
