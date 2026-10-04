package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f27774a;
    public final int f27775b;
    public final ChatActivityEnterView f27776c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27774a = i11;
        this.f27776c = chatActivityEnterView;
        this.f27775b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27774a) {
            case 0:
                int i10 = this.f27775b;
                ChatActivityEnterView chatActivityEnterView = this.f27776c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27776c;
                lw0 lw0Var = chatActivityEnterView2.f23925m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f23877d5 == null) {
                        fgVar.getLayoutParams().height = this.f27775b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (lw0Var != null) {
                    lw0Var.requestLayout();
                    lw0Var.setForeground(null);
                    lw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23997z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f23888f2, true, true);
                }
                ke keVar = chatActivityEnterView2.f23952r0;
                if (keVar != null) {
                    keVar.run();
                    chatActivityEnterView2.f23952r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
