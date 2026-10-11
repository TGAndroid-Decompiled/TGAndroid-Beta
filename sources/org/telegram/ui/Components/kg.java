package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg extends AnimatorListenerAdapter {
    public final int f27961a;
    public final int f27962b;
    public final ChatActivityEnterView f27963c;

    public kg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f27961a = i11;
        this.f27963c = chatActivityEnterView;
        this.f27962b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27961a) {
            case 0:
                int i10 = this.f27962b;
                ChatActivityEnterView chatActivityEnterView = this.f27963c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f27963c;
                uw0 uw0Var = chatActivityEnterView2.f23916m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gg ggVar = chatActivityEnterView2.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView2.f23868d5 == null) {
                        ggVar.getLayoutParams().height = this.f27962b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (uw0Var != null) {
                    uw0Var.requestLayout();
                    uw0Var.setForeground(null);
                    uw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23988z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f23879f2, true, true);
                }
                le leVar = chatActivityEnterView2.f23943r0;
                if (leVar != null) {
                    leVar.run();
                    chatActivityEnterView2.f23943r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
