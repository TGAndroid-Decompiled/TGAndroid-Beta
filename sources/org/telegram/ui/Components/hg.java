package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f26889a;
    public final int f26890b;
    public final ChatActivityEnterView f26891c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f26889a = i11;
        this.f26891c = chatActivityEnterView;
        this.f26890b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26889a) {
            case 0:
                int i10 = this.f26890b;
                ChatActivityEnterView chatActivityEnterView = this.f26891c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f26891c;
                lw0 lw0Var = chatActivityEnterView2.f23985m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f23937d5 == null) {
                        dgVar.getLayoutParams().height = this.f26890b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (lw0Var != null) {
                    lw0Var.requestLayout();
                    lw0Var.setForeground(null);
                    lw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24057z2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f23947f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f24012r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f24012r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
