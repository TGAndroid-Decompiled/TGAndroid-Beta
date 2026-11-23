package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be extends AnimatorListenerAdapter {
    public final int f33832a;
    public final int f33833b;
    public final ChatActivityEnterView f33834c;

    public be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f33832a = i10;
        this.f33834c = chatActivityEnterView;
        this.f33833b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33832a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33834c;
                du0 du0Var = chatActivityEnterView.f32591c2;
                chatActivityEnterView.f32700q4 = false;
                chatActivityEnterView.f32709r4 = null;
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f32612e7 == null) {
                        fgVar.getLayoutParams().height = this.f33833b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (du0Var != null) {
                    du0Var.requestLayout();
                    du0Var.setForeground(null);
                    du0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32691p3 && chatActivityEnterView.S0()) {
                    chatActivityEnterView.X1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.f32714s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.f32714s0 = null;
                }
                chatActivityEnterView.B4.e();
                return;
            default:
                int i7 = this.f33833b;
                ChatActivityEnterView chatActivityEnterView2 = this.f33834c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32699q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32751x2.setTranslationY(0.0f);
                chatActivityEnterView2.f32751x2.setVisibility(8);
                chatActivityEnterView2.B4.e();
                ng ngVar = chatActivityEnterView2.P3;
                if (ngVar != null) {
                    ngVar.x(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                return;
        }
    }
}
