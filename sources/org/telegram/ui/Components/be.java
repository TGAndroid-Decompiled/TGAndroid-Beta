package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be extends AnimatorListenerAdapter {
    public final int f33742a;
    public final ChatActivityEnterView f33743b;

    public be(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33742a = i7;
        this.f33743b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33742a) {
            case 4:
                ChatActivityEnterView chatActivityEnterView = this.f33743b;
                if (animator.equals(chatActivityEnterView.f32704i3)) {
                    chatActivityEnterView.f32704i3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = this.f33743b;
                if (animator.equals(chatActivityEnterView2.f32697h3)) {
                    chatActivityEnterView2.f32697h3 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView3 = this.f33743b;
                if (animator.equals(chatActivityEnterView3.f32704i3)) {
                    chatActivityEnterView3.f32704i3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView4 = this.f33743b;
                if (animator.equals(chatActivityEnterView4.f32697h3)) {
                    chatActivityEnterView4.f32697h3 = null;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView5 = this.f33743b;
                if (animator.equals(chatActivityEnterView5.f32704i3)) {
                    chatActivityEnterView5.f32704i3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView6 = this.f33743b;
                if (animator.equals(chatActivityEnterView6.f32697h3)) {
                    chatActivityEnterView6.f32697h3 = null;
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
        switch (this.f33742a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33743b;
                chatActivityEnterView.f32773r4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f33743b;
                chatActivityEnterView2.f32773r4 = null;
                chatActivityEnterView2.V0.setLayerType(0, null);
                chatActivityEnterView2.B4.e();
                return;
            case 2:
                this.f33743b.f32653c0.setVisibility(8);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33743b;
                ee eeVar = chatActivityEnterView3.f32679f1;
                if (eeVar != null) {
                    eeVar.setVisibility(8);
                }
                chatActivityEnterView3.s1();
                hf hfVar = chatActivityEnterView3.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                chatActivityEnterView3.X0();
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33743b;
                if (animator.equals(chatActivityEnterView4.f32704i3)) {
                    chatActivityEnterView4.f32680f2.setVisibility(8);
                    chatActivityEnterView4.f32704i3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33743b;
                if (animator.equals(chatActivityEnterView5.f32697h3)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.f32636a1.setVisibility(8);
                    je jeVar = chatActivityEnterView5.T0;
                    if (jeVar != null) {
                        jeVar.setVisibility(8);
                    }
                    chatActivityEnterView5.f32697h3 = null;
                    chatActivityEnterView5.f32725l3 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33743b;
                if (animator.equals(chatActivityEnterView6.f32704i3)) {
                    chatActivityEnterView6.f32704i3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33743b;
                if (animator.equals(chatActivityEnterView7.f32697h3)) {
                    chatActivityEnterView7.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView7.Q0.setVisibility(8);
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f32636a1.setVisibility(8);
                    chatActivityEnterView7.T0.setVisibility(0);
                    chatActivityEnterView7.f32697h3 = null;
                    chatActivityEnterView7.f32725l3 = 0;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView8 = this.f33743b;
                if (animator.equals(chatActivityEnterView8.f32704i3)) {
                    chatActivityEnterView8.f32704i3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView9 = this.f33743b;
                if (animator.equals(chatActivityEnterView9.f32697h3)) {
                    chatActivityEnterView9.setSlowModeButtonVisible(false);
                    chatActivityEnterView9.f32697h3 = null;
                    chatActivityEnterView9.f32725l3 = 0;
                    pe peVar = chatActivityEnterView9.f32636a1;
                    if (peVar != null) {
                        peVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                qe qeVar = this.f33743b.f32654c1;
                if (qeVar != null) {
                    qeVar.setScaleX(1.0f);
                    qeVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView10 = this.f33743b;
                qe qeVar2 = chatActivityEnterView10.f32654c1;
                if (qeVar2 != null) {
                    qeVar2.setAlpha(1.0f);
                }
                pe peVar2 = chatActivityEnterView10.f32636a1;
                if (peVar2 != null) {
                    peVar2.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.f33743b;
                chatActivityEnterView11.W0 = null;
                mg mgVar = chatActivityEnterView11.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView11.requestLayout();
                chatActivityEnterView11.B4.e();
                return;
        }
    }
}
