package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final int f34959a;
    public final int f34960b;
    public final ChatActivityEnterView f34961c;

    public yf(ChatActivityEnterView chatActivityEnterView, int i9, int i10) {
        this.f34959a = i10;
        this.f34961c = chatActivityEnterView;
        this.f34960b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34959a) {
            case 0:
                int i9 = this.f34960b;
                ChatActivityEnterView chatActivityEnterView = this.f34961c;
                if (i9 == 0) {
                    chatActivityEnterView.f26194v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34961c;
                xu0 xu0Var = chatActivityEnterView2.f26121h1;
                chatActivityEnterView2.f26195v3 = false;
                chatActivityEnterView2.f26200w3 = null;
                uf ufVar = chatActivityEnterView2.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        ufVar.getLayoutParams().height = this.f34960b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (xu0Var != null) {
                    xu0Var.requestLayout();
                    xu0Var.setForeground(null);
                    xu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f26189u2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.a2, true, true);
                }
                yd ydVar = chatActivityEnterView2.f26150n0;
                if (ydVar != null) {
                    ydVar.run();
                    chatActivityEnterView2.f26150n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                return;
        }
    }
}
