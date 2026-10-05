package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class af extends AnimatorListenerAdapter {
    public final int f24591a;
    public final ChatActivityEnterView f24592b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24591a = i10;
        this.f24592b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24591a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f24592b;
                if (animator.equals(chatActivityEnterView.f23963s2)) {
                    chatActivityEnterView.f23963s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f24592b;
                if (animator.equals(chatActivityEnterView2.f23957r2)) {
                    chatActivityEnterView2.f23957r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f24592b;
                if (animator.equals(chatActivityEnterView3.f23963s2)) {
                    chatActivityEnterView3.f23963s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f24592b;
                if (animator.equals(chatActivityEnterView4.f23957r2)) {
                    chatActivityEnterView4.f23957r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f24592b;
                if (animator.equals(chatActivityEnterView5.f23963s2)) {
                    chatActivityEnterView5.f23963s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f24592b;
                if (animator.equals(chatActivityEnterView6.f23957r2)) {
                    chatActivityEnterView6.f23957r2 = null;
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
        switch (this.f24591a) {
            case 0:
                this.f24592b.f23862b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24592b;
                me meVar = chatActivityEnterView.f23883e1;
                if (meVar != null) {
                    meVar.setVisibility(8);
                }
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.requestFocus();
                }
                chatActivityEnterView.x0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f24592b;
                if (animator.equals(chatActivityEnterView2.f23963s2)) {
                    chatActivityEnterView2.f23945p1.setVisibility(8);
                    chatActivityEnterView2.f23963s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f24592b;
                if (animator.equals(chatActivityEnterView3.f23957r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    df dfVar = chatActivityEnterView3.S0;
                    if (dfVar != null) {
                        dfVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f23957r2 = null;
                    chatActivityEnterView3.f23978v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f24592b;
                if (animator.equals(chatActivityEnterView4.f23963s2)) {
                    chatActivityEnterView4.f23963s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f24592b;
                if (animator.equals(chatActivityEnterView5.f23957r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f23957r2 = null;
                    chatActivityEnterView5.f23978v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f24592b;
                if (animator.equals(chatActivityEnterView6.f23963s2)) {
                    chatActivityEnterView6.f23963s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f24592b;
                if (animator.equals(chatActivityEnterView7.f23957r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f23957r2 = null;
                    chatActivityEnterView7.f23978v2 = 0;
                    we weVar = chatActivityEnterView7.Z0;
                    if (weVar != null) {
                        weVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                xe xeVar = this.f24592b.f23863b1;
                if (xeVar != null) {
                    xeVar.setScaleX(1.0f);
                    xeVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                xe xeVar2 = this.f24592b.f23863b1;
                if (xeVar2 != null) {
                    xeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f24592b;
                chatActivityEnterView8.V0 = null;
                pg pgVar = chatActivityEnterView8.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f24592b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f24592b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.unlock();
                return;
        }
    }
}
