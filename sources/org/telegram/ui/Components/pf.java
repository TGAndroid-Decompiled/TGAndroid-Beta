package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pf extends AnimatorListenerAdapter {
    public final int f36903a;
    public final int f36904b;
    public final ChatActivityEnterView f36905c;

    public pf(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f36903a = i10;
        this.f36905c = chatActivityEnterView;
        this.f36904b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36903a) {
            case 0:
                int i7 = this.f36904b;
                ChatActivityEnterView chatActivityEnterView = this.f36905c;
                if (i7 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.e();
                vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36905c;
                st0 st0Var = chatActivityEnterView2.f31103m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                lf lfVar = chatActivityEnterView2.U0;
                if (lfVar != null) {
                    if (chatActivityEnterView2.f31080h5 == null) {
                        lfVar.getLayoutParams().height = this.f36904b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (st0Var != null) {
                    st0Var.requestLayout();
                    st0Var.setForeground(null);
                    st0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f31179z2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f31065f2, true, true);
                }
                qd qdVar = chatActivityEnterView2.f31132r0;
                if (qdVar != null) {
                    qdVar.run();
                    chatActivityEnterView2.f31132r0 = null;
                }
                chatActivityEnterView2.L3.e();
                return;
        }
    }
}
