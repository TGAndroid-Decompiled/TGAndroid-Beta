package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd extends AnimatorListenerAdapter {
    public final int f39274a;
    public final int f39275b;
    public final ChatActivityEnterView f39276c;

    public sd(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f39274a = i10;
        this.f39276c = chatActivityEnterView;
        this.f39275b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39274a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39276c;
                st0 st0Var = chatActivityEnterView.U1;
                chatActivityEnterView.f32217i4 = false;
                chatActivityEnterView.f32223j4 = null;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    if (chatActivityEnterView.C6 == null) {
                        sfVar.getLayoutParams().height = this.f39275b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (st0Var != null) {
                    st0Var.requestLayout();
                    st0Var.setForeground(null);
                    st0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.f32209h3 && chatActivityEnterView.G0()) {
                    chatActivityEnterView.L1(0, chatActivityEnterView.N2, true, true);
                }
                nd ndVar = chatActivityEnterView.f32281s0;
                if (ndVar != null) {
                    ndVar.run();
                    chatActivityEnterView.f32281s0 = null;
                }
                chatActivityEnterView.f32291t4.e();
                return;
            default:
                int i7 = this.f39275b;
                ChatActivityEnterView chatActivityEnterView2 = this.f39276c;
                if (i7 == 0) {
                    chatActivityEnterView2.f32216i3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32260p2.setTranslationY(0.0f);
                chatActivityEnterView2.f32260p2.setVisibility(8);
                chatActivityEnterView2.f32291t4.e();
                cg cgVar = chatActivityEnterView2.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                return;
        }
    }
}
