package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye extends AnimatorListenerAdapter {
    public final int f30640a;
    public final ChatActivityEnterView f30641b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30640a = i10;
        this.f30641b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30640a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f30641b;
                if (animator.equals(chatActivityEnterView.f22075s2)) {
                    chatActivityEnterView.f22075s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f30641b;
                if (animator.equals(chatActivityEnterView2.f22069r2)) {
                    chatActivityEnterView2.f22069r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f30641b;
                if (animator.equals(chatActivityEnterView3.f22075s2)) {
                    chatActivityEnterView3.f22075s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f30641b;
                if (animator.equals(chatActivityEnterView4.f22069r2)) {
                    chatActivityEnterView4.f22069r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f30641b;
                if (animator.equals(chatActivityEnterView5.f22075s2)) {
                    chatActivityEnterView5.f22075s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f30641b;
                if (animator.equals(chatActivityEnterView6.f22069r2)) {
                    chatActivityEnterView6.f22069r2 = null;
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
        switch (this.f30640a) {
            case 0:
                this.f30641b.f21975b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f30641b;
                ke keVar = chatActivityEnterView.f21995e1;
                if (keVar != null) {
                    keVar.setVisibility(8);
                }
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                chatActivityEnterView.x0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f30641b;
                if (animator.equals(chatActivityEnterView2.f22075s2)) {
                    chatActivityEnterView2.f22057p1.setVisibility(8);
                    chatActivityEnterView2.f22075s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f30641b;
                if (animator.equals(chatActivityEnterView3.f22069r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    bf bfVar = chatActivityEnterView3.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f22069r2 = null;
                    chatActivityEnterView3.f22090v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f30641b;
                if (animator.equals(chatActivityEnterView4.f22075s2)) {
                    chatActivityEnterView4.f22075s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f30641b;
                if (animator.equals(chatActivityEnterView5.f22069r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f22069r2 = null;
                    chatActivityEnterView5.f22090v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f30641b;
                if (animator.equals(chatActivityEnterView6.f22075s2)) {
                    chatActivityEnterView6.f22075s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f30641b;
                if (animator.equals(chatActivityEnterView7.f22069r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f22069r2 = null;
                    chatActivityEnterView7.f22090v2 = 0;
                    ue ueVar = chatActivityEnterView7.Z0;
                    if (ueVar != null) {
                        ueVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ve veVar = this.f30641b.f21976b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    veVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ve veVar2 = this.f30641b.f21976b1;
                if (veVar2 != null) {
                    veVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f30641b;
                chatActivityEnterView8.V0 = null;
                ng ngVar = chatActivityEnterView8.Z2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f30641b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f30641b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.unlock();
                return;
        }
    }
}
