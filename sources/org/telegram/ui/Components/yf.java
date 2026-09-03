package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final int f33522a;
    public final int f33523b;
    public final ChatActivityEnterView f33524c;

    public yf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f33522a = i11;
        this.f33524c = chatActivityEnterView;
        this.f33523b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33522a) {
            case 0:
                int i10 = this.f33523b;
                ChatActivityEnterView chatActivityEnterView = this.f33524c;
                if (i10 == 0) {
                    chatActivityEnterView.f24697w2 = 0;
                }
                chatActivityEnterView.S0 = null;
                chatActivityEnterView.D1.setTranslationY(0.0f);
                chatActivityEnterView.D1.setVisibility(8);
                chatActivityEnterView.H3.unlock();
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33524c;
                pv0 pv0Var = chatActivityEnterView2.f24623i1;
                chatActivityEnterView2.f24698w3 = false;
                chatActivityEnterView2.f24704x3 = null;
                uf ufVar = chatActivityEnterView2.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView2.Z4 == null) {
                        ufVar.getLayoutParams().height = this.f33523b;
                    }
                    chatActivityEnterView2.R0.setLayerType(0, null);
                }
                if (pv0Var != null) {
                    pv0Var.requestLayout();
                    pv0Var.setForeground(null);
                    pv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24691v2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f24580b2, true, true);
                }
                yd ydVar = chatActivityEnterView2.f24652o0;
                if (ydVar != null) {
                    ydVar.run();
                    chatActivityEnterView2.f24652o0 = null;
                }
                chatActivityEnterView2.H3.unlock();
                return;
        }
    }
}
