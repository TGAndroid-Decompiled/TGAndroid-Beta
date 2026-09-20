package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg extends AnimatorListenerAdapter {
    public final int f24658a;
    public final int f24659b;
    public final ChatActivityEnterView f24660c;

    public hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24658a = i11;
        this.f24660c = chatActivityEnterView;
        this.f24659b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24658a) {
            case 0:
                int i10 = this.f24659b;
                ChatActivityEnterView chatActivityEnterView = this.f24660c;
                if (i10 == 0) {
                    chatActivityEnterView.f22096z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24660c;
                aw0 aw0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f22097z3 = false;
                chatActivityEnterView2.A3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.f21972c5 == null) {
                        dgVar.getLayoutParams().height = this.f24659b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (aw0Var != null) {
                    aw0Var.requestLayout();
                    aw0Var.setForeground(null);
                    aw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f22092y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.f21981e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f22051r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f22051r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
