package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg extends AnimatorListenerAdapter {
    public final int f27968a;
    public final int f27969b;
    public final ChatActivityEnterView f27970c;

    public kg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27968a = i11;
        this.f27970c = chatActivityEnterView;
        this.f27969b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27968a) {
            case 0:
                int i10 = this.f27969b;
                ChatActivityEnterView chatActivityEnterView = this.f27970c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27970c;
                sw0 sw0Var = chatActivityEnterView2.f23924m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gg ggVar = chatActivityEnterView2.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView2.f23876d5 == null) {
                        ggVar.getLayoutParams().height = this.f27969b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (sw0Var != null) {
                    sw0Var.requestLayout();
                    sw0Var.setForeground(null);
                    sw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23996z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23887f2, true, true);
                }
                le leVar = chatActivityEnterView2.f23951r0;
                if (leVar != null) {
                    leVar.run();
                    chatActivityEnterView2.f23951r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
