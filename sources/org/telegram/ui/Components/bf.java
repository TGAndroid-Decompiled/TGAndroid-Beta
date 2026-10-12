package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf extends AnimatorListenerAdapter {
    public final int f24630a;
    public final ChatActivityEnterView f24631b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24630a = i10;
        this.f24631b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24630a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f24631b;
                if (animator.equals(chatActivityEnterView.f23728s2)) {
                    chatActivityEnterView.f23728s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f24631b;
                if (animator.equals(chatActivityEnterView2.f23721r2)) {
                    chatActivityEnterView2.f23721r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f24631b;
                if (animator.equals(chatActivityEnterView3.f23728s2)) {
                    chatActivityEnterView3.f23728s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f24631b;
                if (animator.equals(chatActivityEnterView4.f23721r2)) {
                    chatActivityEnterView4.f23721r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f24631b;
                if (animator.equals(chatActivityEnterView5.f23728s2)) {
                    chatActivityEnterView5.f23728s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f24631b;
                if (animator.equals(chatActivityEnterView6.f23721r2)) {
                    chatActivityEnterView6.f23721r2 = null;
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
        switch (this.f24630a) {
            case 0:
                this.f24631b.f23623b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24631b;
                ne neVar = chatActivityEnterView.f23644e1;
                if (neVar != null) {
                    neVar.setVisibility(8);
                }
                uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null) {
                    ufVar.requestFocus();
                }
                chatActivityEnterView.z0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f24631b;
                if (animator.equals(chatActivityEnterView2.f23728s2)) {
                    chatActivityEnterView2.f23708p1.setVisibility(8);
                    chatActivityEnterView2.f23728s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f24631b;
                if (animator.equals(chatActivityEnterView3.f23721r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ef efVar = chatActivityEnterView3.S0;
                    if (efVar != null) {
                        efVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f23721r2 = null;
                    chatActivityEnterView3.f23746v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f24631b;
                if (animator.equals(chatActivityEnterView4.f23728s2)) {
                    chatActivityEnterView4.f23728s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f24631b;
                if (animator.equals(chatActivityEnterView5.f23721r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f23721r2 = null;
                    chatActivityEnterView5.f23746v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f24631b;
                if (animator.equals(chatActivityEnterView6.f23728s2)) {
                    chatActivityEnterView6.f23728s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f24631b;
                if (animator.equals(chatActivityEnterView7.f23721r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f23721r2 = null;
                    chatActivityEnterView7.f23746v2 = 0;
                    xe xeVar = chatActivityEnterView7.Z0;
                    if (xeVar != null) {
                        xeVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ye yeVar = this.f24631b.f23624b1;
                if (yeVar != null) {
                    yeVar.setScaleX(1.0f);
                    yeVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ye yeVar2 = this.f24631b.f23624b1;
                if (yeVar2 != null) {
                    yeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f24631b;
                chatActivityEnterView8.V0 = null;
                sg sgVar = chatActivityEnterView8.Z2;
                if (sgVar != null) {
                    sgVar.z(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.f23699n4.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f24631b;
                chatActivityEnterView9.f23640d4 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f24631b;
                chatActivityEnterView10.f23640d4 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.f23699n4.unlock();
                return;
        }
    }
}
