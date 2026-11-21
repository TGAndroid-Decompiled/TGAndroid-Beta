package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ae extends AnimatorListenerAdapter {
    public final int f33490a;
    public final ChatActivityEnterView f33491b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33490a = i7;
        this.f33491b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33490a) {
            case 4:
                ChatActivityEnterView chatActivityEnterView = this.f33491b;
                if (animator.equals(chatActivityEnterView.f32637i3)) {
                    chatActivityEnterView.f32637i3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = this.f33491b;
                if (animator.equals(chatActivityEnterView2.f32630h3)) {
                    chatActivityEnterView2.f32630h3 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView3 = this.f33491b;
                if (animator.equals(chatActivityEnterView3.f32637i3)) {
                    chatActivityEnterView3.f32637i3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView4 = this.f33491b;
                if (animator.equals(chatActivityEnterView4.f32630h3)) {
                    chatActivityEnterView4.f32630h3 = null;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView5 = this.f33491b;
                if (animator.equals(chatActivityEnterView5.f32637i3)) {
                    chatActivityEnterView5.f32637i3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView6 = this.f33491b;
                if (animator.equals(chatActivityEnterView6.f32630h3)) {
                    chatActivityEnterView6.f32630h3 = null;
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
        switch (this.f33490a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33491b;
                chatActivityEnterView.f32706r4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f33491b;
                chatActivityEnterView2.f32706r4 = null;
                chatActivityEnterView2.V0.setLayerType(0, null);
                chatActivityEnterView2.B4.e();
                return;
            case 2:
                this.f33491b.f32586c0.setVisibility(8);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33491b;
                de deVar = chatActivityEnterView3.f32612f1;
                if (deVar != null) {
                    deVar.setVisibility(8);
                }
                chatActivityEnterView3.r1();
                gf gfVar = chatActivityEnterView3.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                chatActivityEnterView3.W0();
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33491b;
                if (animator.equals(chatActivityEnterView4.f32637i3)) {
                    chatActivityEnterView4.f32613f2.setVisibility(8);
                    chatActivityEnterView4.f32637i3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33491b;
                if (animator.equals(chatActivityEnterView5.f32630h3)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.f32569a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView5.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView5.f32630h3 = null;
                    chatActivityEnterView5.f32658l3 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33491b;
                if (animator.equals(chatActivityEnterView6.f32637i3)) {
                    chatActivityEnterView6.f32637i3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33491b;
                if (animator.equals(chatActivityEnterView7.f32630h3)) {
                    chatActivityEnterView7.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView7.Q0.setVisibility(8);
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f32569a1.setVisibility(8);
                    chatActivityEnterView7.T0.setVisibility(0);
                    chatActivityEnterView7.f32630h3 = null;
                    chatActivityEnterView7.f32658l3 = 0;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView8 = this.f33491b;
                if (animator.equals(chatActivityEnterView8.f32637i3)) {
                    chatActivityEnterView8.f32637i3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView9 = this.f33491b;
                if (animator.equals(chatActivityEnterView9.f32630h3)) {
                    chatActivityEnterView9.setSlowModeButtonVisible(false);
                    chatActivityEnterView9.f32630h3 = null;
                    chatActivityEnterView9.f32658l3 = 0;
                    oe oeVar = chatActivityEnterView9.f32569a1;
                    if (oeVar != null) {
                        oeVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                pe peVar = this.f33491b.f32587c1;
                if (peVar != null) {
                    peVar.setScaleX(1.0f);
                    peVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView10 = this.f33491b;
                pe peVar2 = chatActivityEnterView10.f32587c1;
                if (peVar2 != null) {
                    peVar2.setAlpha(1.0f);
                }
                oe oeVar2 = chatActivityEnterView10.f32569a1;
                if (oeVar2 != null) {
                    oeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.f33491b;
                chatActivityEnterView11.W0 = null;
                ng ngVar = chatActivityEnterView11.P3;
                if (ngVar != null) {
                    ngVar.x(0.0f);
                }
                chatActivityEnterView11.requestLayout();
                chatActivityEnterView11.B4.e();
                return;
        }
    }
}
