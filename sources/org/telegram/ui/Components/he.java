package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he extends AnimatorListenerAdapter {
    public final int f34230a;
    public final ChatActivityEnterView f34231b;

    public he(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f34230a = i7;
        this.f34231b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34230a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f34231b;
                if (animator.equals(chatActivityEnterView.f31125s2)) {
                    chatActivityEnterView.f31125s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f34231b;
                if (animator.equals(chatActivityEnterView2.f31118r2)) {
                    chatActivityEnterView2.f31118r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f34231b;
                if (animator.equals(chatActivityEnterView3.f31125s2)) {
                    chatActivityEnterView3.f31125s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f34231b;
                if (animator.equals(chatActivityEnterView4.f31118r2)) {
                    chatActivityEnterView4.f31118r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f34231b;
                if (animator.equals(chatActivityEnterView5.f31125s2)) {
                    chatActivityEnterView5.f31125s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f34231b;
                if (animator.equals(chatActivityEnterView6.f31118r2)) {
                    chatActivityEnterView6.f31118r2 = null;
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
        switch (this.f34230a) {
            case 0:
                this.f34231b.f31021b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f34231b;
                ud udVar = chatActivityEnterView.f31041e1;
                if (udVar != null) {
                    udVar.setVisibility(8);
                }
                xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                chatActivityEnterView.w0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f34231b;
                if (animator.equals(chatActivityEnterView2.f31125s2)) {
                    chatActivityEnterView2.f31104p1.setVisibility(8);
                    chatActivityEnterView2.f31125s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f34231b;
                if (animator.equals(chatActivityEnterView3.f31118r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ke keVar = chatActivityEnterView3.S0;
                    if (keVar != null) {
                        keVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f31118r2 = null;
                    chatActivityEnterView3.f31140v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f34231b;
                if (animator.equals(chatActivityEnterView4.f31125s2)) {
                    chatActivityEnterView4.f31125s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f34231b;
                if (animator.equals(chatActivityEnterView5.f31118r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f31118r2 = null;
                    chatActivityEnterView5.f31140v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f34231b;
                if (animator.equals(chatActivityEnterView6.f31125s2)) {
                    chatActivityEnterView6.f31125s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f34231b;
                if (animator.equals(chatActivityEnterView7.f31118r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f31118r2 = null;
                    chatActivityEnterView7.f31140v2 = 0;
                    de deVar = chatActivityEnterView7.Z0;
                    if (deVar != null) {
                        deVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ee eeVar = this.f34231b.f31022b1;
                if (eeVar != null) {
                    eeVar.setScaleX(1.0f);
                    eeVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ee eeVar2 = this.f34231b.f31022b1;
                if (eeVar2 != null) {
                    eeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f34231b;
                chatActivityEnterView8.V0 = null;
                wf wfVar = chatActivityEnterView8.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.e();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f34231b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f34231b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.e();
                return;
        }
    }
}
