package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe extends AnimatorListenerAdapter {
    public final int f27828a;
    public final ChatActivityEnterView f27829b;

    public pe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27828a = i10;
        this.f27829b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27828a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f27829b;
                if (animator.equals(chatActivityEnterView.f22812o2)) {
                    chatActivityEnterView.f22812o2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f27829b;
                if (animator.equals(chatActivityEnterView2.f22807n2)) {
                    chatActivityEnterView2.f22807n2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f27829b;
                if (animator.equals(chatActivityEnterView3.f22812o2)) {
                    chatActivityEnterView3.f22812o2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f27829b;
                if (animator.equals(chatActivityEnterView4.f22807n2)) {
                    chatActivityEnterView4.f22807n2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f27829b;
                if (animator.equals(chatActivityEnterView5.f22812o2)) {
                    chatActivityEnterView5.f22812o2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f27829b;
                if (animator.equals(chatActivityEnterView6.f22807n2)) {
                    chatActivityEnterView6.f22807n2 = null;
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
        switch (this.f27828a) {
            case 0:
                this.f27829b.V.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27829b;
                ae aeVar = chatActivityEnterView.f22738b1;
                if (aeVar != null) {
                    aeVar.setVisibility(8);
                }
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                chatActivityEnterView.x0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f27829b;
                if (animator.equals(chatActivityEnterView2.f22812o2)) {
                    chatActivityEnterView2.l1.setVisibility(8);
                    chatActivityEnterView2.f22812o2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f27829b;
                if (animator.equals(chatActivityEnterView3.f22807n2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.M0.setVisibility(8);
                    chatActivityEnterView3.W0.setVisibility(8);
                    se seVar = chatActivityEnterView3.P0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f22807n2 = null;
                    chatActivityEnterView3.f22828r2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f27829b;
                if (animator.equals(chatActivityEnterView4.f22812o2)) {
                    chatActivityEnterView4.f22812o2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f27829b;
                if (animator.equals(chatActivityEnterView5.f22807n2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.M0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.W0.setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(0);
                    chatActivityEnterView5.f22807n2 = null;
                    chatActivityEnterView5.f22828r2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f27829b;
                if (animator.equals(chatActivityEnterView6.f22812o2)) {
                    chatActivityEnterView6.f22812o2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f27829b;
                if (animator.equals(chatActivityEnterView7.f22807n2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f22807n2 = null;
                    chatActivityEnterView7.f22828r2 = 0;
                    le leVar = chatActivityEnterView7.W0;
                    if (leVar != null) {
                        leVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                me meVar = this.f27829b.Y0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    meVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                me meVar2 = this.f27829b.Y0;
                if (meVar2 != null) {
                    meVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f27829b;
                chatActivityEnterView8.S0 = null;
                eg egVar = chatActivityEnterView8.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.H3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f27829b;
                chatActivityEnterView9.f22862x3 = null;
                chatActivityEnterView9.R0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f27829b;
                chatActivityEnterView10.f22862x3 = null;
                chatActivityEnterView10.R0.setLayerType(0, null);
                chatActivityEnterView10.H3.unlock();
                return;
        }
    }
}
