package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we extends AnimatorListenerAdapter {
    public final int f32218a;
    public final ChatActivityEnterView f32219b;

    public we(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32218a = i10;
        this.f32219b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32218a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f32219b;
                if (animator.equals(chatActivityEnterView.f24163s2)) {
                    chatActivityEnterView.f24163s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f32219b;
                if (animator.equals(chatActivityEnterView2.f24157r2)) {
                    chatActivityEnterView2.f24157r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f32219b;
                if (animator.equals(chatActivityEnterView3.f24163s2)) {
                    chatActivityEnterView3.f24163s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f32219b;
                if (animator.equals(chatActivityEnterView4.f24157r2)) {
                    chatActivityEnterView4.f24157r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f32219b;
                if (animator.equals(chatActivityEnterView5.f24163s2)) {
                    chatActivityEnterView5.f24163s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f32219b;
                if (animator.equals(chatActivityEnterView6.f24157r2)) {
                    chatActivityEnterView6.f24157r2 = null;
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
        switch (this.f32218a) {
            case 0:
                this.f32219b.f24059b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f32219b;
                ie ieVar = chatActivityEnterView.f24079e1;
                if (ieVar != null) {
                    ieVar.setVisibility(8);
                }
                nf nfVar = chatActivityEnterView.E0;
                if (nfVar != null) {
                    nfVar.requestFocus();
                }
                chatActivityEnterView.u0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f32219b;
                if (animator.equals(chatActivityEnterView2.f24163s2)) {
                    chatActivityEnterView2.f24144p1.setVisibility(8);
                    chatActivityEnterView2.f24163s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f32219b;
                if (animator.equals(chatActivityEnterView3.f24157r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ze zeVar = chatActivityEnterView3.S0;
                    if (zeVar != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f24157r2 = null;
                    chatActivityEnterView3.f24178v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f32219b;
                if (animator.equals(chatActivityEnterView4.f24163s2)) {
                    chatActivityEnterView4.f24163s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f32219b;
                if (animator.equals(chatActivityEnterView5.f24157r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f24157r2 = null;
                    chatActivityEnterView5.f24178v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f32219b;
                if (animator.equals(chatActivityEnterView6.f24163s2)) {
                    chatActivityEnterView6.f24163s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f32219b;
                if (animator.equals(chatActivityEnterView7.f24157r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f24157r2 = null;
                    chatActivityEnterView7.f24178v2 = 0;
                    se seVar = chatActivityEnterView7.Z0;
                    if (seVar != null) {
                        seVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                te teVar = this.f32219b.f24060b1;
                if (teVar != null) {
                    teVar.setScaleX(1.0f);
                    teVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                te teVar2 = this.f32219b.f24060b1;
                if (teVar2 != null) {
                    teVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f32219b;
                chatActivityEnterView8.V0 = null;
                mg mgVar = chatActivityEnterView8.Z2;
                if (mgVar != null) {
                    mgVar.z(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f32219b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f32219b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.unlock();
                return;
        }
    }
}
