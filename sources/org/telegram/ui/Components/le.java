package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class le extends AnimatorListenerAdapter {

    public final int f30366a;

    public final ChatActivityEnterView f30367b;

    public le(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30366a = i10;
        this.f30367b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30366a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f30367b;
                if (animator.equals(chatActivityEnterView.f26148n2)) {
                    chatActivityEnterView.f26148n2 = null;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f30367b;
                if (animator.equals(chatActivityEnterView2.f26142m2)) {
                    chatActivityEnterView2.f26142m2 = null;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f30367b;
                if (animator.equals(chatActivityEnterView3.f26148n2)) {
                    chatActivityEnterView3.f26148n2 = null;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f30367b;
                if (animator.equals(chatActivityEnterView4.f26142m2)) {
                    chatActivityEnterView4.f26142m2 = null;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f30367b;
                if (animator.equals(chatActivityEnterView5.f26148n2)) {
                    chatActivityEnterView5.f26148n2 = null;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f30367b;
                if (animator.equals(chatActivityEnterView6.f26142m2)) {
                    chatActivityEnterView6.f26142m2 = null;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30366a) {
            case 0:
                this.f30367b.U.setVisibility(8);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f30367b;
                wd wdVar = chatActivityEnterView.f26073a1;
                if (wdVar != null) {
                    wdVar.setVisibility(8);
                }
                bf bfVar = chatActivityEnterView.A0;
                if (bfVar != null) {
                    bfVar.requestFocus();
                }
                chatActivityEnterView.x0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f30367b;
                if (animator.equals(chatActivityEnterView2.f26148n2)) {
                    chatActivityEnterView2.f26133k1.setVisibility(8);
                    chatActivityEnterView2.f26148n2 = null;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f30367b;
                if (animator.equals(chatActivityEnterView3.f26142m2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.L0.setVisibility(8);
                    chatActivityEnterView3.V0.setVisibility(8);
                    oe oeVar = chatActivityEnterView3.O0;
                    if (oeVar != null) {
                        oeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f26142m2 = null;
                    chatActivityEnterView3.f26163q2 = 0;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f30367b;
                if (animator.equals(chatActivityEnterView4.f26148n2)) {
                    chatActivityEnterView4.f26148n2 = null;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f30367b;
                if (animator.equals(chatActivityEnterView5.f26142m2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.L0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.V0.setVisibility(8);
                    chatActivityEnterView5.O0.setVisibility(0);
                    chatActivityEnterView5.f26142m2 = null;
                    chatActivityEnterView5.f26163q2 = 0;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f30367b;
                if (animator.equals(chatActivityEnterView6.f26148n2)) {
                    chatActivityEnterView6.f26148n2 = null;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f30367b;
                if (animator.equals(chatActivityEnterView7.f26142m2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f26142m2 = null;
                    chatActivityEnterView7.f26163q2 = 0;
                    he heVar = chatActivityEnterView7.V0;
                    if (heVar != null) {
                        heVar.setVisibility(0);
                    }
                }
                break;
            case 8:
                ie ieVar = this.f30367b.X0;
                if (ieVar != null) {
                    ieVar.setScaleX(1.0f);
                    ieVar.setScaleY(1.0f);
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                ie ieVar2 = this.f30367b.X0;
                if (ieVar2 != null) {
                    ieVar2.setAlpha(1.0f);
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f30367b;
                chatActivityEnterView8.R0 = null;
                ag agVar = chatActivityEnterView8.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.G3.unlock();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f30367b;
                chatActivityEnterView9.f26196w3 = null;
                chatActivityEnterView9.Q0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f30367b;
                chatActivityEnterView10.f26196w3 = null;
                chatActivityEnterView10.Q0.setLayerType(0, null);
                chatActivityEnterView10.G3.unlock();
                break;
        }
    }
}
