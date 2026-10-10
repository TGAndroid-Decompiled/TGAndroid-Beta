package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg extends AnimatorListenerAdapter {
    public final int f28012a;
    public final int f28013b;
    public final ChatActivityEnterView f28014c;

    public kg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28012a = i11;
        this.f28014c = chatActivityEnterView;
        this.f28013b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28012a) {
            case 0:
                int i10 = this.f28013b;
                ChatActivityEnterView chatActivityEnterView = this.f28014c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f28014c;
                tw0 tw0Var = chatActivityEnterView2.f23928m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gg ggVar = chatActivityEnterView2.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView2.f23880d5 == null) {
                        ggVar.getLayoutParams().height = this.f28013b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (tw0Var != null) {
                    tw0Var.requestLayout();
                    tw0Var.setForeground(null);
                    tw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24000z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23891f2, true, true);
                }
                le leVar = chatActivityEnterView2.f23955r0;
                if (leVar != null) {
                    leVar.run();
                    chatActivityEnterView2.f23955r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
