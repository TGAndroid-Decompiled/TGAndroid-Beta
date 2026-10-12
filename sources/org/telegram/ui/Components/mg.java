package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mg extends AnimatorListenerAdapter {
    public final int f28534a;
    public final int f28535b;
    public final ChatActivityEnterView f28536c;

    public mg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.f28534a = i11;
        this.f28536c = chatActivityEnterView;
        this.f28535b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28534a) {
            case 0:
                int i10 = this.f28535b;
                ChatActivityEnterView chatActivityEnterView = this.f28536c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.f23700n4.unlock();
                sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28536c;
                yw0 yw0Var = chatActivityEnterView2.f23690m1;
                chatActivityEnterView2.f23635c4 = false;
                chatActivityEnterView2.f23641d4 = null;
                ig igVar = chatActivityEnterView2.U0;
                if (igVar != null) {
                    if (chatActivityEnterView2.G5 == null) {
                        igVar.getLayoutParams().height = this.f28535b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (yw0Var != null) {
                    yw0Var.requestLayout();
                    yw0Var.setForeground(null);
                    yw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.f23773z2 && chatActivityEnterView2.u0()) {
                    chatActivityEnterView2.v1(0, chatActivityEnterView2.f23653f2, true, true);
                }
                vd vdVar = chatActivityEnterView2.f23720r0;
                if (vdVar != null) {
                    vdVar.run();
                    chatActivityEnterView2.f23720r0 = null;
                }
                chatActivityEnterView2.f23700n4.unlock();
                return;
        }
    }
}
