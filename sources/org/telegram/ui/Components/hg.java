package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f26872a;
    public final int f26873b;
    public final ChatActivityEnterView f26874c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f26872a = i11;
        this.f26874c = chatActivityEnterView;
        this.f26873b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26872a) {
            case 0:
                int i10 = this.f26873b;
                ChatActivityEnterView chatActivityEnterView = this.f26874c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26874c;
                kw0 kw0Var = chatActivityEnterView2.f23979m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f23931d5 == null) {
                        dgVar.getLayoutParams().height = this.f26873b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (kw0Var != null) {
                    kw0Var.requestLayout();
                    kw0Var.setForeground(null);
                    kw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24051z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f23941f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f24006r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f24006r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
