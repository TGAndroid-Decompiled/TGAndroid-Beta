package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f28987a;
    public final int f28988b;
    public final ChatActivityEnterView f28989c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28987a = i11;
        this.f28989c = chatActivityEnterView;
        this.f28988b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28987a) {
            case 0:
                int i10 = this.f28988b;
                ChatActivityEnterView chatActivityEnterView = this.f28989c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f28989c;
                ww0 ww0Var = chatActivityEnterView2.f25919m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f25896h5 == null) {
                        dgVar.getLayoutParams().height = this.f28988b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ww0Var != null) {
                    ww0Var.requestLayout();
                    ww0Var.setForeground(null);
                    ww0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f25994z2 && chatActivityEnterView2.p0()) {
                    chatActivityEnterView2.p1(0, chatActivityEnterView2.f25881f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f25949r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f25949r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
