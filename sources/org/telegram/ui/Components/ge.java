package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge extends AnimatorListenerAdapter {
    public final int f33879a;
    public final ChatActivityEnterView f33880b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33879a = i7;
        this.f33880b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33879a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f33880b;
                if (animator.equals(chatActivityEnterView.f31141s2)) {
                    chatActivityEnterView.f31141s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f33880b;
                if (animator.equals(chatActivityEnterView2.f31134r2)) {
                    chatActivityEnterView2.f31134r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f33880b;
                if (animator.equals(chatActivityEnterView3.f31141s2)) {
                    chatActivityEnterView3.f31141s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f33880b;
                if (animator.equals(chatActivityEnterView4.f31134r2)) {
                    chatActivityEnterView4.f31134r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f33880b;
                if (animator.equals(chatActivityEnterView5.f31141s2)) {
                    chatActivityEnterView5.f31141s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f33880b;
                if (animator.equals(chatActivityEnterView6.f31134r2)) {
                    chatActivityEnterView6.f31134r2 = null;
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
        switch (this.f33879a) {
            case 0:
                this.f33880b.f31037b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f33880b;
                td tdVar = chatActivityEnterView.f31057e1;
                if (tdVar != null) {
                    tdVar.setVisibility(8);
                }
                we weVar = chatActivityEnterView.E0;
                if (weVar != null) {
                    weVar.requestFocus();
                }
                chatActivityEnterView.w0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f33880b;
                if (animator.equals(chatActivityEnterView2.f31141s2)) {
                    chatActivityEnterView2.f31120p1.setVisibility(8);
                    chatActivityEnterView2.f31141s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33880b;
                if (animator.equals(chatActivityEnterView3.f31134r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    je jeVar = chatActivityEnterView3.S0;
                    if (jeVar != null) {
                        jeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f31134r2 = null;
                    chatActivityEnterView3.f31156v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33880b;
                if (animator.equals(chatActivityEnterView4.f31141s2)) {
                    chatActivityEnterView4.f31141s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33880b;
                if (animator.equals(chatActivityEnterView5.f31134r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f31134r2 = null;
                    chatActivityEnterView5.f31156v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33880b;
                if (animator.equals(chatActivityEnterView6.f31141s2)) {
                    chatActivityEnterView6.f31141s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33880b;
                if (animator.equals(chatActivityEnterView7.f31134r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f31134r2 = null;
                    chatActivityEnterView7.f31156v2 = 0;
                    ce ceVar = chatActivityEnterView7.Z0;
                    if (ceVar != null) {
                        ceVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                de deVar = this.f33880b.f31038b1;
                if (deVar != null) {
                    deVar.setScaleX(1.0f);
                    deVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                de deVar2 = this.f33880b.f31038b1;
                if (deVar2 != null) {
                    deVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f33880b;
                chatActivityEnterView8.V0 = null;
                vf vfVar = chatActivityEnterView8.Z2;
                if (vfVar != null) {
                    vfVar.w(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.e();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f33880b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f33880b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.e();
                return;
        }
    }
}
