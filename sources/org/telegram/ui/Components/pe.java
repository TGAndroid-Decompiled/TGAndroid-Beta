package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class pe extends AnimatorListenerAdapter {

    public final int f31591a;

    public final boolean f31592b;

    public final ChatActivityEnterView f31593c;

    public pe(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f31591a = i10;
        this.f31593c = chatActivityEnterView;
        this.f31592b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31591a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f31593c;
                if (animator.equals(chatActivityEnterView.f26148n2)) {
                    chatActivityEnterView.f26148n2 = null;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        me meVar;
        switch (this.f31591a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f31593c;
                if (chatActivityEnterView.f26115g5) {
                    chatActivityEnterView.f26168r1.setVisibility(this.f31592b ? 0 : 8);
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f31593c;
                if (animator.equals(chatActivityEnterView2.f26148n2)) {
                    chatActivityEnterView2.f26133k1.setVisibility(8);
                    if (this.f31592b && (meVar = chatActivityEnterView2.E1) != null) {
                        meVar.setVisibility(8);
                    }
                    chatActivityEnterView2.f26148n2 = null;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f31593c;
                chatActivityEnterView3.H1 = null;
                if (!this.f31592b) {
                    chatActivityEnterView3.E1.setVisibility(8);
                }
                break;
            default:
                float f10 = this.f31592b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.f31593c;
                chatActivityEnterView4.f26173s0 = f10;
                qf qfVar = chatActivityEnterView4.Q0;
                if (qfVar != null) {
                    qfVar.a0();
                }
                break;
        }
    }
}
