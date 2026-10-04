package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f27769a;
    public final int f27770b;
    public final ChatActivityEnterView f27771c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27769a = i11;
        this.f27771c = chatActivityEnterView;
        this.f27770b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27769a) {
            case 0:
                int i10 = this.f27770b;
                ChatActivityEnterView chatActivityEnterView = this.f27771c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27771c;
                lw0 lw0Var = chatActivityEnterView2.f23921m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f23873d5 == null) {
                        fgVar.getLayoutParams().height = this.f27770b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (lw0Var != null) {
                    lw0Var.requestLayout();
                    lw0Var.setForeground(null);
                    lw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23993z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f23884f2, true, true);
                }
                ke keVar = chatActivityEnterView2.f23948r0;
                if (keVar != null) {
                    keVar.run();
                    chatActivityEnterView2.f23948r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
