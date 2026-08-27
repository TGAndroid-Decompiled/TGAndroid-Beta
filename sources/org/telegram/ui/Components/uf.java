package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class uf extends AnimatorListenerAdapter {

    public final int f33068a;

    public final int f33069b;

    public final ChatActivityEnterView f33070c;

    public uf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f33068a = i11;
        this.f33070c = chatActivityEnterView;
        this.f33069b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33068a) {
            case 0:
                int i10 = this.f33069b;
                ChatActivityEnterView chatActivityEnterView = this.f33070c;
                if (i10 == 0) {
                    chatActivityEnterView.f26190v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33070c;
                zu0 zu0Var = chatActivityEnterView2.f26117h1;
                chatActivityEnterView2.f26191v3 = false;
                chatActivityEnterView2.f26196w3 = null;
                qf qfVar = chatActivityEnterView2.Q0;
                if (qfVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        qfVar.getLayoutParams().height = this.f33069b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (zu0Var != null) {
                    zu0Var.requestLayout();
                    zu0Var.setForeground(null);
                    zu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f26185u2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.a2, true, true);
                }
                ud udVar = chatActivityEnterView2.f26146n0;
                if (udVar != null) {
                    udVar.run();
                    chatActivityEnterView2.f26146n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                break;
        }
    }
}
