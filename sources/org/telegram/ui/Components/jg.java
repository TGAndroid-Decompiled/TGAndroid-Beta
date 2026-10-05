package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f27841a;
    public final int f27842b;
    public final ChatActivityEnterView f27843c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27841a = i11;
        this.f27843c = chatActivityEnterView;
        this.f27842b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27841a) {
            case 0:
                int i10 = this.f27842b;
                ChatActivityEnterView chatActivityEnterView = this.f27843c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27843c;
                mw0 mw0Var = chatActivityEnterView2.f23928m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f23880d5 == null) {
                        fgVar.getLayoutParams().height = this.f27842b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (mw0Var != null) {
                    mw0Var.requestLayout();
                    mw0Var.setForeground(null);
                    mw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24000z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f23891f2, true, true);
                }
                ke keVar = chatActivityEnterView2.f23955r0;
                if (keVar != null) {
                    keVar.run();
                    chatActivityEnterView2.f23955r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
