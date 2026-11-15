package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ie extends AnimatorListenerAdapter {
    public final int f35614a;
    public final ChatActivityEnterView f35615b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35614a = i7;
        this.f35615b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35614a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f35615b;
                if (animator.equals(chatActivityEnterView.f32157a3)) {
                    chatActivityEnterView.f32157a3 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f35615b;
                if (animator.equals(chatActivityEnterView2.Z2)) {
                    chatActivityEnterView2.Z2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f35615b;
                if (animator.equals(chatActivityEnterView3.f32157a3)) {
                    chatActivityEnterView3.f32157a3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f35615b;
                if (animator.equals(chatActivityEnterView4.Z2)) {
                    chatActivityEnterView4.Z2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f35615b;
                if (animator.equals(chatActivityEnterView5.f32157a3)) {
                    chatActivityEnterView5.f32157a3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f35615b;
                if (animator.equals(chatActivityEnterView6.Z2)) {
                    chatActivityEnterView6.Z2 = null;
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
        switch (this.f35614a) {
            case 0:
                this.f35615b.f32170c0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f35615b;
                ud udVar = chatActivityEnterView.f32193f1;
                if (udVar != null) {
                    udVar.setVisibility(8);
                }
                chatActivityEnterView.f1();
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                chatActivityEnterView.K0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f35615b;
                if (animator.equals(chatActivityEnterView2.f32157a3)) {
                    chatActivityEnterView2.X1.setVisibility(8);
                    chatActivityEnterView2.f32157a3 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f35615b;
                if (animator.equals(chatActivityEnterView3.Z2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.Q0.setVisibility(8);
                    chatActivityEnterView3.f32155a1.setVisibility(8);
                    zd zdVar = chatActivityEnterView3.T0;
                    if (zdVar != null) {
                        zdVar.setVisibility(8);
                    }
                    chatActivityEnterView3.Z2 = null;
                    chatActivityEnterView3.f32179d3 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f35615b;
                if (animator.equals(chatActivityEnterView4.f32157a3)) {
                    chatActivityEnterView4.f32157a3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f35615b;
                if (animator.equals(chatActivityEnterView5.Z2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.f32155a1.setVisibility(8);
                    chatActivityEnterView5.T0.setVisibility(0);
                    chatActivityEnterView5.Z2 = null;
                    chatActivityEnterView5.f32179d3 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f35615b;
                if (animator.equals(chatActivityEnterView6.f32157a3)) {
                    chatActivityEnterView6.f32157a3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f35615b;
                if (animator.equals(chatActivityEnterView7.Z2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.Z2 = null;
                    chatActivityEnterView7.f32179d3 = 0;
                    ee eeVar = chatActivityEnterView7.f32155a1;
                    if (eeVar != null) {
                        eeVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                fe feVar = this.f35615b.f32171c1;
                if (feVar != null) {
                    feVar.setScaleX(1.0f);
                    feVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView8 = this.f35615b;
                fe feVar2 = chatActivityEnterView8.f32171c1;
                if (feVar2 != null) {
                    feVar2.setAlpha(1.0f);
                }
                ee eeVar2 = chatActivityEnterView8.f32155a1;
                if (eeVar2 != null) {
                    eeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView9 = this.f35615b;
                chatActivityEnterView9.W0 = null;
                cg cgVar = chatActivityEnterView9.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView9.requestLayout();
                chatActivityEnterView9.f32291t4.e();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView10 = this.f35615b;
                chatActivityEnterView10.f32223j4 = null;
                chatActivityEnterView10.V0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.f35615b;
                chatActivityEnterView11.f32223j4 = null;
                chatActivityEnterView11.V0.setLayerType(0, null);
                chatActivityEnterView11.f32291t4.e();
                return;
        }
    }
}
