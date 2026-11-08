package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final int f37315a;
    public final int f37316b;
    public final ChatActivityEnterView f37317c;

    public qf(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.f37315a = i10;
        this.f37317c = chatActivityEnterView;
        this.f37316b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37315a) {
            case 0:
                int i7 = this.f37316b;
                ChatActivityEnterView chatActivityEnterView = this.f37317c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f37317c;
                rt0 rt0Var = chatActivityEnterView2.f31087m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                mf mfVar = chatActivityEnterView2.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView2.f31064h5 == null) {
                        mfVar.getLayoutParams().height = this.f37316b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (rt0Var != null) {
                    rt0Var.requestLayout();
                    rt0Var.setForeground(null);
                    rt0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f31163z2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f31049f2, true, true);
                }
                rd rdVar = chatActivityEnterView2.f31116r0;
                if (rdVar != null) {
                    rdVar.run();
                    chatActivityEnterView2.f31116r0 = null;
                }
                chatActivityEnterView2.L3.e();
                return;
        }
    }
}
