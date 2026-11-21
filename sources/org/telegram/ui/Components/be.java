package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be extends AnimatorListenerAdapter {
    public final int f33839a;
    public final int f33840b;
    public final ChatActivityEnterView f33841c;

    public be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f33839a = i10;
        this.f33841c = chatActivityEnterView;
        this.f33840b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33839a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33841c;
                du0 du0Var = chatActivityEnterView.f32588c2;
                chatActivityEnterView.f32697q4 = false;
                chatActivityEnterView.f32706r4 = null;
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f32609e7 == null) {
                        fgVar.getLayoutParams().height = this.f33840b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (du0Var != null) {
                    du0Var.requestLayout();
                    du0Var.setForeground(null);
                    du0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32688p3 && chatActivityEnterView.S0()) {
                    chatActivityEnterView.X1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.f32711s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.f32711s0 = null;
                }
                chatActivityEnterView.B4.e();
                return;
            default:
                int i7 = this.f33840b;
                ChatActivityEnterView chatActivityEnterView2 = this.f33841c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32696q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32748x2.setTranslationY(0.0f);
                chatActivityEnterView2.f32748x2.setVisibility(8);
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
