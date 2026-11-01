package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ce extends AnimatorListenerAdapter {
    public final int f25096a;
    public final ChatActivityEnterView f25097b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25096a = i10;
        this.f25097b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25096a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f25097b;
                if (animator.equals(chatActivityEnterView.f23786s2)) {
                    chatActivityEnterView.f23786s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f25097b;
                if (animator.equals(chatActivityEnterView2.f23779r2)) {
                    chatActivityEnterView2.f23779r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f25097b;
                if (animator.equals(chatActivityEnterView3.f23786s2)) {
                    chatActivityEnterView3.f23786s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f25097b;
                if (animator.equals(chatActivityEnterView4.f23779r2)) {
                    chatActivityEnterView4.f23779r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f25097b;
                if (animator.equals(chatActivityEnterView5.f23786s2)) {
                    chatActivityEnterView5.f23786s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f25097b;
                if (animator.equals(chatActivityEnterView6.f23779r2)) {
                    chatActivityEnterView6.f23779r2 = null;
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
        switch (this.f25096a) {
            case 0:
                this.f25097b.f23681b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25097b;
                pd pdVar = chatActivityEnterView.f23701e1;
                if (pdVar != null) {
                    pdVar.setVisibility(8);
                }
                se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                chatActivityEnterView.u0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f25097b;
                if (animator.equals(chatActivityEnterView2.f23786s2)) {
                    chatActivityEnterView2.f23766p1.setVisibility(8);
                    chatActivityEnterView2.f23786s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f25097b;
                if (animator.equals(chatActivityEnterView3.f23779r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    fe feVar = chatActivityEnterView3.S0;
                    if (feVar != null) {
                        feVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f23779r2 = null;
                    chatActivityEnterView3.f23801v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f25097b;
                if (animator.equals(chatActivityEnterView4.f23786s2)) {
                    chatActivityEnterView4.f23786s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f25097b;
                if (animator.equals(chatActivityEnterView5.f23779r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f23779r2 = null;
                    chatActivityEnterView5.f23801v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f25097b;
                if (animator.equals(chatActivityEnterView6.f23786s2)) {
                    chatActivityEnterView6.f23786s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f25097b;
                if (animator.equals(chatActivityEnterView7.f23779r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f23779r2 = null;
                    chatActivityEnterView7.f23801v2 = 0;
                    yd ydVar = chatActivityEnterView7.Z0;
                    if (ydVar != null) {
                        ydVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                zd zdVar = this.f25097b.f23682b1;
                if (zdVar != null) {
                    zdVar.setScaleX(1.0f);
                    zdVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                zd zdVar2 = this.f25097b.f23682b1;
                if (zdVar2 != null) {
                    zdVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f25097b;
                chatActivityEnterView8.V0 = null;
                sf sfVar = chatActivityEnterView8.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.e();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f25097b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f25097b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.e();
                return;
        }
    }
}
