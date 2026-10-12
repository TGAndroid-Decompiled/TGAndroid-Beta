package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg extends AnimatorListenerAdapter {
    public final int f26350a;
    public final int f26351b;
    public final ChatActivityEnterView f26352c;

    public jg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f26350a = i11;
        this.f26352c = chatActivityEnterView;
        this.f26351b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26350a) {
            case 0:
                int i10 = this.f26351b;
                ChatActivityEnterView chatActivityEnterView = this.f26352c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26352c;
                ow0 ow0Var = chatActivityEnterView2.f22923m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f22875d5 == null) {
                        fgVar.getLayoutParams().height = this.f26351b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ow0Var != null) {
                    ow0Var.requestLayout();
                    ow0Var.setForeground(null);
                    ow0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22995z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f22885f2, true, true);
                }
                je jeVar = chatActivityEnterView2.f22950r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.f22950r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
