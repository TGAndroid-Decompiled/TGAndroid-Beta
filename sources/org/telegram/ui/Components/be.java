package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be extends AnimatorListenerAdapter {
    public final int f33809a;
    public final int f33810b;
    public final ChatActivityEnterView f33811c;

    public be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f33809a = i10;
        this.f33811c = chatActivityEnterView;
        this.f33810b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33809a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33811c;
                du0 du0Var = chatActivityEnterView.f32557c2;
                chatActivityEnterView.f32666q4 = false;
                chatActivityEnterView.f32675r4 = null;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.f32578e7 == null) {
                        egVar.getLayoutParams().height = this.f33810b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (du0Var != null) {
                    du0Var.requestLayout();
                    du0Var.setForeground(null);
                    du0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32657p3 && chatActivityEnterView.S0()) {
                    chatActivityEnterView.X1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.f32680s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.f32680s0 = null;
                }
                chatActivityEnterView.B4.e();
                return;
            default:
                int i7 = this.f33810b;
                ChatActivityEnterView chatActivityEnterView2 = this.f33811c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32665q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32717x2.setTranslationY(0.0f);
                chatActivityEnterView2.f32717x2.setVisibility(8);
                chatActivityEnterView2.B4.e();
                mg mgVar = chatActivityEnterView2.P3;
                if (mgVar != null) {
                    mgVar.x(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                return;
        }
    }
}
