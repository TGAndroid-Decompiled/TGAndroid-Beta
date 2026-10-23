package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f26914a;
    public final int f26915b;
    public final ChatActivityEnterView f26916c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f26914a = i11;
        this.f26916c = chatActivityEnterView;
        this.f26915b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26914a) {
            case 0:
                int i10 = this.f26915b;
                ChatActivityEnterView chatActivityEnterView = this.f26916c;
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
                ChatActivityEnterView chatActivityEnterView2 = this.f26916c;
                ow0 ow0Var = chatActivityEnterView2.f24124m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f24101h5 == null) {
                        dgVar.getLayoutParams().height = this.f26915b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ow0Var != null) {
                    ow0Var.requestLayout();
                    ow0Var.setForeground(null);
                    ow0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f24199z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.q1(0, chatActivityEnterView2.f24086f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f24154r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f24154r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                return;
        }
    }
}
