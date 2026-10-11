package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf extends AnimatorListenerAdapter {
    public final int f24996a;
    public final ChatActivityEnterView f24997b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24996a = i10;
        this.f24997b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24996a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f24997b;
                if (animator.equals(chatActivityEnterView.f23987s2)) {
                    chatActivityEnterView.f23987s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f24997b;
                if (animator.equals(chatActivityEnterView2.f23981r2)) {
                    chatActivityEnterView2.f23981r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f24997b;
                if (animator.equals(chatActivityEnterView3.f23987s2)) {
                    chatActivityEnterView3.f23987s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f24997b;
                if (animator.equals(chatActivityEnterView4.f23981r2)) {
                    chatActivityEnterView4.f23981r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f24997b;
                if (animator.equals(chatActivityEnterView5.f23987s2)) {
                    chatActivityEnterView5.f23987s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f24997b;
                if (animator.equals(chatActivityEnterView6.f23981r2)) {
                    chatActivityEnterView6.f23981r2 = null;
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
        switch (this.f24996a) {
            case 0:
                this.f24997b.f23886b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24997b;
                ne neVar = chatActivityEnterView.f23907e1;
                if (neVar != null) {
                    neVar.setVisibility(8);
                }
                sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.requestFocus();
                }
                chatActivityEnterView.v0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f24997b;
                if (animator.equals(chatActivityEnterView2.f23987s2)) {
                    chatActivityEnterView2.f23969p1.setVisibility(8);
                    chatActivityEnterView2.f23987s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f24997b;
                if (animator.equals(chatActivityEnterView3.f23981r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ef efVar = chatActivityEnterView3.S0;
                    if (efVar != null) {
                        efVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f23981r2 = null;
                    chatActivityEnterView3.f24002v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f24997b;
                if (animator.equals(chatActivityEnterView4.f23987s2)) {
                    chatActivityEnterView4.f23987s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f24997b;
                if (animator.equals(chatActivityEnterView5.f23981r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f23981r2 = null;
                    chatActivityEnterView5.f24002v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f24997b;
                if (animator.equals(chatActivityEnterView6.f23987s2)) {
                    chatActivityEnterView6.f23987s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f24997b;
                if (animator.equals(chatActivityEnterView7.f23981r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f23981r2 = null;
                    chatActivityEnterView7.f24002v2 = 0;
                    xe xeVar = chatActivityEnterView7.Z0;
                    if (xeVar != null) {
                        xeVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ye yeVar = this.f24997b.f23887b1;
                if (yeVar != null) {
                    yeVar.setScaleX(1.0f);
                    yeVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ye yeVar2 = this.f24997b.f23887b1;
                if (yeVar2 != null) {
                    yeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f24997b;
                chatActivityEnterView8.V0 = null;
                qg qgVar = chatActivityEnterView8.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f24997b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f24997b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.unlock();
                return;
        }
    }
}
