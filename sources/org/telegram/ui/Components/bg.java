package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final int f27071a;
    public final int f27072b;
    public final ChatActivityEnterView f27073c;

    public bg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27071a = i11;
        this.f27073c = chatActivityEnterView;
        this.f27072b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27071a) {
            case 0:
                int i10 = this.f27072b;
                ChatActivityEnterView chatActivityEnterView = this.f27073c;
                if (i10 == 0) {
                    chatActivityEnterView.f26205v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27073c;
                hv0 hv0Var = chatActivityEnterView2.f26132h1;
                chatActivityEnterView2.f26206v3 = false;
                chatActivityEnterView2.f26212w3 = null;
                xf xfVar = chatActivityEnterView2.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        xfVar.getLayoutParams().height = this.f27072b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (hv0Var != null) {
                    hv0Var.requestLayout();
                    hv0Var.setForeground(null);
                    hv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f26200u2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.a2, true, true);
                }
                be beVar = chatActivityEnterView2.f26161n0;
                if (beVar != null) {
                    beVar.run();
                    chatActivityEnterView2.f26161n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                return;
        }
    }
}
