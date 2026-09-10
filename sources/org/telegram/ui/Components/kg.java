package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg extends AnimatorListenerAdapter {
    public final int f24708a;
    public final int f24709b;
    public final ChatActivityEnterView f24710c;

    public kg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f24708a = i11;
        this.f24710c = chatActivityEnterView;
        this.f24709b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24708a) {
            case 0:
                int i10 = this.f24709b;
                ChatActivityEnterView chatActivityEnterView = this.f24710c;
                if (i10 == 0) {
                    chatActivityEnterView.f20960z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24710c;
                aw0 aw0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.f20961z3 = false;
                chatActivityEnterView2.A3 = null;
                fg fgVar = chatActivityEnterView2.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView2.f20836c5 == null) {
                        fgVar.getLayoutParams().height = this.f24709b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (aw0Var != null) {
                    aw0Var.requestLayout();
                    aw0Var.setForeground(null);
                    aw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f20956y2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f20845e2, true, true);
                }
                ie ieVar = chatActivityEnterView2.f20915r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.f20915r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                return;
        }
    }
}
