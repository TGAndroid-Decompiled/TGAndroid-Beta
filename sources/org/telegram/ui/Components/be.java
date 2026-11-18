package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be extends AnimatorListenerAdapter {
    public final int f33668a;
    public final int f33669b;
    public final ChatActivityEnterView f33670c;

    public be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f33668a = i10;
        this.f33670c = chatActivityEnterView;
        this.f33669b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33668a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33670c;
                au0 au0Var = chatActivityEnterView.f32542a2;
                chatActivityEnterView.o4 = false;
                chatActivityEnterView.f32659p4 = null;
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    if (chatActivityEnterView.f32565c7 == null) {
                        cgVar.getLayoutParams().height = this.f33669b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (au0Var != null) {
                    au0Var.requestLayout();
                    au0Var.setForeground(null);
                    au0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32645n3 && chatActivityEnterView.O0()) {
                    chatActivityEnterView.T1(0, chatActivityEnterView.T2, true, true);
                }
                dd ddVar = chatActivityEnterView.f32678s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.f32678s0 = null;
                }
                chatActivityEnterView.f32732z4.e();
                return;
            default:
                int i7 = this.f33669b;
                ChatActivityEnterView chatActivityEnterView2 = this.f33670c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32652o3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32699v2.setTranslationY(0.0f);
                chatActivityEnterView2.f32699v2.setVisibility(8);
                chatActivityEnterView2.f32732z4.e();
                kg kgVar = chatActivityEnterView2.N3;
                if (kgVar != null) {
                    kgVar.x(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                return;
        }
    }
}
