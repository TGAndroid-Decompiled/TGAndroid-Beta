package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg extends AnimatorListenerAdapter {
    public final int f28059a;
    public final int f28060b;
    public final ChatActivityEnterView f28061c;

    public kg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28059a = i11;
        this.f28061c = chatActivityEnterView;
        this.f28060b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28059a) {
            case 0:
                int i10 = this.f28060b;
                ChatActivityEnterView chatActivityEnterView = this.f28061c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f28061c;
                tw0 tw0Var = chatActivityEnterView2.f23952m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gg ggVar = chatActivityEnterView2.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView2.f23904d5 == null) {
                        ggVar.getLayoutParams().height = this.f28060b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (tw0Var != null) {
                    tw0Var.requestLayout();
                    tw0Var.setForeground(null);
                    tw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24024z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23915f2, true, true);
                }
                le leVar = chatActivityEnterView2.f23979r0;
                if (leVar != null) {
                    leVar.run();
                    chatActivityEnterView2.f23979r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
