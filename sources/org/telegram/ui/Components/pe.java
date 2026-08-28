package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe extends AnimatorListenerAdapter {
    public final int f31617a;
    public final ChatActivityEnterView f31618b;

    public pe(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f31617a = i9;
        this.f31618b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31617a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f31618b;
                if (animator.equals(chatActivityEnterView.f26152n2)) {
                    chatActivityEnterView.f26152n2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f31618b;
                if (animator.equals(chatActivityEnterView2.f26146m2)) {
                    chatActivityEnterView2.f26146m2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f31618b;
                if (animator.equals(chatActivityEnterView3.f26152n2)) {
                    chatActivityEnterView3.f26152n2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f31618b;
                if (animator.equals(chatActivityEnterView4.f26146m2)) {
                    chatActivityEnterView4.f26146m2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f31618b;
                if (animator.equals(chatActivityEnterView5.f26152n2)) {
                    chatActivityEnterView5.f26152n2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f31618b;
                if (animator.equals(chatActivityEnterView6.f26146m2)) {
                    chatActivityEnterView6.f26146m2 = null;
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
        switch (this.f31617a) {
            case 0:
                this.f31618b.U.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f31618b;
                ae aeVar = chatActivityEnterView.f26077a1;
                if (aeVar != null) {
                    aeVar.setVisibility(8);
                }
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                chatActivityEnterView.w0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f31618b;
                if (animator.equals(chatActivityEnterView2.f26152n2)) {
                    chatActivityEnterView2.f26137k1.setVisibility(8);
                    chatActivityEnterView2.f26152n2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f31618b;
                if (animator.equals(chatActivityEnterView3.f26146m2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.L0.setVisibility(8);
                    chatActivityEnterView3.V0.setVisibility(8);
                    se seVar = chatActivityEnterView3.O0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f26146m2 = null;
                    chatActivityEnterView3.f26167q2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f31618b;
                if (animator.equals(chatActivityEnterView4.f26152n2)) {
                    chatActivityEnterView4.f26152n2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f31618b;
                if (animator.equals(chatActivityEnterView5.f26146m2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.L0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.V0.setVisibility(8);
                    chatActivityEnterView5.O0.setVisibility(0);
                    chatActivityEnterView5.f26146m2 = null;
                    chatActivityEnterView5.f26167q2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f31618b;
                if (animator.equals(chatActivityEnterView6.f26152n2)) {
                    chatActivityEnterView6.f26152n2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f31618b;
                if (animator.equals(chatActivityEnterView7.f26146m2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f26146m2 = null;
                    chatActivityEnterView7.f26167q2 = 0;
                    le leVar = chatActivityEnterView7.V0;
                    if (leVar != null) {
                        leVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                me meVar = this.f31618b.X0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    meVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                me meVar2 = this.f31618b.X0;
                if (meVar2 != null) {
                    meVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f31618b;
                chatActivityEnterView8.R0 = null;
                eg egVar = chatActivityEnterView8.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.G3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f31618b;
                chatActivityEnterView9.f26200w3 = null;
                chatActivityEnterView9.Q0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f31618b;
                chatActivityEnterView10.f26200w3 = null;
                chatActivityEnterView10.Q0.setLayerType(0, null);
                chatActivityEnterView10.G3.unlock();
                return;
        }
    }
}
