package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fe extends AnimatorListenerAdapter {
    public final int f33780a;
    public final ChatActivityEnterView f33781b;

    public fe(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f33780a = i3;
        this.f33781b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33780a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f33781b;
                if (animator.equals(chatActivityEnterView.f31200t2)) {
                    chatActivityEnterView.f31200t2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f33781b;
                if (animator.equals(chatActivityEnterView2.f31194s2)) {
                    chatActivityEnterView2.f31194s2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f33781b;
                if (animator.equals(chatActivityEnterView3.f31200t2)) {
                    chatActivityEnterView3.f31200t2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f33781b;
                if (animator.equals(chatActivityEnterView4.f31194s2)) {
                    chatActivityEnterView4.f31194s2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f33781b;
                if (animator.equals(chatActivityEnterView5.f31200t2)) {
                    chatActivityEnterView5.f31200t2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f33781b;
                if (animator.equals(chatActivityEnterView6.f31194s2)) {
                    chatActivityEnterView6.f31194s2 = null;
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
        switch (this.f33780a) {
            case 0:
                this.f33781b.f31098c0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f33781b;
                sd sdVar = chatActivityEnterView.f31118f1;
                if (sdVar != null) {
                    sdVar.setVisibility(8);
                }
                ve veVar = chatActivityEnterView.F0;
                if (veVar != null) {
                    veVar.requestFocus();
                }
                chatActivityEnterView.v0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f33781b;
                if (animator.equals(chatActivityEnterView2.f31200t2)) {
                    chatActivityEnterView2.f31180q1.setVisibility(8);
                    chatActivityEnterView2.f31200t2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33781b;
                if (animator.equals(chatActivityEnterView3.f31194s2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.Q0.setVisibility(8);
                    chatActivityEnterView3.f31085a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView3.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f31194s2 = null;
                    chatActivityEnterView3.f31216w2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33781b;
                if (animator.equals(chatActivityEnterView4.f31200t2)) {
                    chatActivityEnterView4.f31200t2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33781b;
                if (animator.equals(chatActivityEnterView5.f31194s2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.f31085a1.setVisibility(8);
                    chatActivityEnterView5.T0.setVisibility(0);
                    chatActivityEnterView5.f31194s2 = null;
                    chatActivityEnterView5.f31216w2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33781b;
                if (animator.equals(chatActivityEnterView6.f31200t2)) {
                    chatActivityEnterView6.f31200t2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33781b;
                if (animator.equals(chatActivityEnterView7.f31194s2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f31194s2 = null;
                    chatActivityEnterView7.f31216w2 = 0;
                    be beVar = chatActivityEnterView7.f31085a1;
                    if (beVar != null) {
                        beVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ce ceVar = this.f33781b.f31099c1;
                if (ceVar != null) {
                    ceVar.setScaleX(1.0f);
                    ceVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ce ceVar2 = this.f33781b.f31099c1;
                if (ceVar2 != null) {
                    ceVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f33781b;
                chatActivityEnterView8.W0 = null;
                uf ufVar = chatActivityEnterView8.f31087a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.M3.e();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f33781b;
                chatActivityEnterView9.C3 = null;
                chatActivityEnterView9.V0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f33781b;
                chatActivityEnterView10.C3 = null;
                chatActivityEnterView10.V0.setLayerType(0, null);
                chatActivityEnterView10.M3.e();
                return;
        }
    }
}
