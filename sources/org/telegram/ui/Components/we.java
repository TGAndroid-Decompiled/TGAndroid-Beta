package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we extends AnimatorListenerAdapter {
    public final int f29709a;
    public final ChatActivityEnterView f29710b;

    public we(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29709a = i10;
        this.f29710b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29709a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f29710b;
                if (animator.equals(chatActivityEnterView.f21832r2)) {
                    chatActivityEnterView.f21832r2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f29710b;
                if (animator.equals(chatActivityEnterView2.f21826q2)) {
                    chatActivityEnterView2.f21826q2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f29710b;
                if (animator.equals(chatActivityEnterView3.f21832r2)) {
                    chatActivityEnterView3.f21832r2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f29710b;
                if (animator.equals(chatActivityEnterView4.f21826q2)) {
                    chatActivityEnterView4.f21826q2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f29710b;
                if (animator.equals(chatActivityEnterView5.f21832r2)) {
                    chatActivityEnterView5.f21832r2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f29710b;
                if (animator.equals(chatActivityEnterView6.f21826q2)) {
                    chatActivityEnterView6.f21826q2 = null;
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
        switch (this.f29709a) {
            case 0:
                this.f29710b.f21739b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f29710b;
                ie ieVar = chatActivityEnterView.f21759e1;
                if (ieVar != null) {
                    ieVar.setVisibility(8);
                }
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.requestFocus();
                }
                chatActivityEnterView.x0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f29710b;
                if (animator.equals(chatActivityEnterView2.f21832r2)) {
                    chatActivityEnterView2.f21815o1.setVisibility(8);
                    chatActivityEnterView2.f21832r2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f29710b;
                if (animator.equals(chatActivityEnterView3.f21826q2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ze zeVar = chatActivityEnterView3.S0;
                    if (zeVar != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f21826q2 = null;
                    chatActivityEnterView3.f21848u2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f29710b;
                if (animator.equals(chatActivityEnterView4.f21832r2)) {
                    chatActivityEnterView4.f21832r2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f29710b;
                if (animator.equals(chatActivityEnterView5.f21826q2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f21826q2 = null;
                    chatActivityEnterView5.f21848u2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f29710b;
                if (animator.equals(chatActivityEnterView6.f21832r2)) {
                    chatActivityEnterView6.f21832r2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f29710b;
                if (animator.equals(chatActivityEnterView7.f21826q2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f21826q2 = null;
                    chatActivityEnterView7.f21848u2 = 0;
                    se seVar = chatActivityEnterView7.Z0;
                    if (seVar != null) {
                        seVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                te teVar = this.f29710b.f21740b1;
                if (teVar != null) {
                    teVar.setScaleX(1.0f);
                    teVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                te teVar2 = this.f29710b.f21740b1;
                if (teVar2 != null) {
                    teVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f29710b;
                chatActivityEnterView8.V0 = null;
                mg mgVar = chatActivityEnterView8.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.K3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f29710b;
                chatActivityEnterView9.A3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f29710b;
                chatActivityEnterView10.A3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.K3.unlock();
                return;
        }
    }
}
