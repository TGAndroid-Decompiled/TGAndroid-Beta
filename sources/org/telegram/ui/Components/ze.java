package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ze extends AnimatorListenerAdapter {
    public final int f33145a;
    public final ChatActivityEnterView f33146b;

    public ze(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33145a = i10;
        this.f33146b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33145a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f33146b;
                if (animator.equals(chatActivityEnterView.f23763r2)) {
                    chatActivityEnterView.f23763r2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f33146b;
                if (animator.equals(chatActivityEnterView2.f23757q2)) {
                    chatActivityEnterView2.f23757q2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f33146b;
                if (animator.equals(chatActivityEnterView3.f23763r2)) {
                    chatActivityEnterView3.f23763r2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f33146b;
                if (animator.equals(chatActivityEnterView4.f23757q2)) {
                    chatActivityEnterView4.f23757q2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f33146b;
                if (animator.equals(chatActivityEnterView5.f23763r2)) {
                    chatActivityEnterView5.f23763r2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f33146b;
                if (animator.equals(chatActivityEnterView6.f23757q2)) {
                    chatActivityEnterView6.f23757q2 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33145a) {
            case 0:
                this.f33146b.f23669b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f33146b;
                ke keVar = chatActivityEnterView.f23690e1;
                if (keVar != null) {
                    keVar.setVisibility(8);
                }
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.requestFocus();
                }
                chatActivityEnterView.x0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f33146b;
                if (animator.equals(chatActivityEnterView2.f23763r2)) {
                    chatActivityEnterView2.f23746o1.setVisibility(8);
                    chatActivityEnterView2.f23763r2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33146b;
                if (animator.equals(chatActivityEnterView3.f23757q2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    cf cfVar = chatActivityEnterView3.S0;
                    if (cfVar != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f23757q2 = null;
                    chatActivityEnterView3.f23779u2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33146b;
                if (animator.equals(chatActivityEnterView4.f23763r2)) {
                    chatActivityEnterView4.f23763r2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33146b;
                if (animator.equals(chatActivityEnterView5.f23757q2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f23757q2 = null;
                    chatActivityEnterView5.f23779u2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33146b;
                if (animator.equals(chatActivityEnterView6.f23763r2)) {
                    chatActivityEnterView6.f23763r2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33146b;
                if (animator.equals(chatActivityEnterView7.f23757q2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f23757q2 = null;
                    chatActivityEnterView7.f23779u2 = 0;
                    ve veVar = chatActivityEnterView7.Z0;
                    if (veVar != null) {
                        veVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                we weVar = this.f33146b.f23670b1;
                if (weVar != null) {
                    weVar.setScaleX(1.0f);
                    weVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                we weVar2 = this.f33146b.f23670b1;
                if (weVar2 != null) {
                    weVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f33146b;
                chatActivityEnterView8.V0 = null;
                og ogVar = chatActivityEnterView8.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.K3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f33146b;
                chatActivityEnterView9.A3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f33146b;
                chatActivityEnterView10.A3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.K3.unlock();
                return;
        }
    }
}
