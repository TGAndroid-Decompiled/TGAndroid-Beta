package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final int f37304a;
    public final int f37305b;
    public final ChatActivityEnterView f37306c;

    public qf(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f37304a = i10;
        this.f37306c = chatActivityEnterView;
        this.f37305b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37304a) {
            case 0:
                int i7 = this.f37305b;
                ChatActivityEnterView chatActivityEnterView = this.f37306c;
                if (i7 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.e();
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f37306c;
                tt0 tt0Var = chatActivityEnterView2.f31092m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                mf mfVar = chatActivityEnterView2.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView2.f31069h5 == null) {
                        mfVar.getLayoutParams().height = this.f37305b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (tt0Var != null) {
                    tt0Var.requestLayout();
                    tt0Var.setForeground(null);
                    tt0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f31168z2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f31054f2, true, true);
                }
                rd rdVar = chatActivityEnterView2.f31121r0;
                if (rdVar != null) {
                    rdVar.run();
                    chatActivityEnterView2.f31121r0 = null;
                }
                chatActivityEnterView2.L3.e();
                return;
        }
    }
}
