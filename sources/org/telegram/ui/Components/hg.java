package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f28960a;
    public final int f28961b;
    public final ChatActivityEnterView f28962c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28960a = i11;
        this.f28962c = chatActivityEnterView;
        this.f28961b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28960a) {
            case 0:
                int i10 = this.f28961b;
                ChatActivityEnterView chatActivityEnterView = this.f28962c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28962c;
                vw0 vw0Var = chatActivityEnterView2.f25915m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f25892h5 == null) {
                        dgVar.getLayoutParams().height = this.f28961b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (vw0Var != null) {
                    vw0Var.requestLayout();
                    vw0Var.setForeground(null);
                    vw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f25990z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f25877f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f25945r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f25945r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
