package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of extends AnimatorListenerAdapter {
    public final int f36818a;
    public final int f36819b;
    public final ChatActivityEnterView f36820c;

    public of(ChatActivityEnterView chatActivityEnterView, int i3, int i10) {
        this.f36818a = i10;
        this.f36820c = chatActivityEnterView;
        this.f36819b = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36818a) {
            case 0:
                int i3 = this.f36819b;
                ChatActivityEnterView chatActivityEnterView = this.f36820c;
                if (i3 == 0) {
                    chatActivityEnterView.B2 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.I1.setTranslationY(0.0f);
                chatActivityEnterView.I1.setVisibility(8);
                chatActivityEnterView.M3.e();
                uf ufVar = chatActivityEnterView.f31087a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36820c;
                qt0 qt0Var = chatActivityEnterView2.f31163n1;
                chatActivityEnterView2.B3 = false;
                chatActivityEnterView2.C3 = null;
                kf kfVar = chatActivityEnterView2.V0;
                if (kfVar != null) {
                    if (chatActivityEnterView2.f31139i5 == null) {
                        kfVar.getLayoutParams().height = this.f36819b;
                    }
                    chatActivityEnterView2.V0.setLayerType(0, null);
                }
                if (qt0Var != null) {
                    qt0Var.requestLayout();
                    qt0Var.setForeground(null);
                    qt0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.A2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f31125g2, true, true);
                }
                pd pdVar = chatActivityEnterView2.f31192s0;
                if (pdVar != null) {
                    pdVar.run();
                    chatActivityEnterView2.f31192s0 = null;
                }
                chatActivityEnterView2.M3.e();
                return;
        }
    }
}
