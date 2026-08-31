package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final int f33501a;
    public final int f33502b;
    public final ChatActivityEnterView f33503c;

    public yf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f33501a = i11;
        this.f33503c = chatActivityEnterView;
        this.f33502b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33501a) {
            case 0:
                int i10 = this.f33502b;
                ChatActivityEnterView chatActivityEnterView = this.f33503c;
                if (i10 == 0) {
                    chatActivityEnterView.f24695w2 = 0;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f33503c;
                qv0 qv0Var = chatActivityEnterView2.f24621i1;
                chatActivityEnterView2.f24696w3 = false;
                chatActivityEnterView2.f24702x3 = null;
                uf ufVar = chatActivityEnterView2.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView2.Z4 == null) {
                        ufVar.getLayoutParams().height = this.f33502b;
                    }
                    chatActivityEnterView2.R0.setLayerType(0, null);
                }
                if (qv0Var != null) {
                    qv0Var.requestLayout();
                    qv0Var.setForeground(null);
                    qv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24689v2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f24578b2, true, true);
                }
                yd ydVar = chatActivityEnterView2.f24650o0;
                if (ydVar != null) {
                    ydVar.run();
                    chatActivityEnterView2.f24650o0 = null;
                }
                chatActivityEnterView2.H3.unlock();
                return;
        }
    }
}
