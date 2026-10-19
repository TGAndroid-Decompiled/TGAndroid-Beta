package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye extends AnimatorListenerAdapter {
    public final int f32608a;
    public final ChatActivityEnterView f32609b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32608a = i10;
        this.f32609b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32608a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f32609b;
                if (animator.equals(chatActivityEnterView.f24016s2)) {
                    chatActivityEnterView.f24016s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.f32609b;
                if (animator.equals(chatActivityEnterView2.f24010r2)) {
                    chatActivityEnterView2.f24010r2 = null;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.f32609b;
                if (animator.equals(chatActivityEnterView3.f24016s2)) {
                    chatActivityEnterView3.f24016s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.f32609b;
                if (animator.equals(chatActivityEnterView4.f24010r2)) {
                    chatActivityEnterView4.f24010r2 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.f32609b;
                if (animator.equals(chatActivityEnterView5.f24016s2)) {
                    chatActivityEnterView5.f24016s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.f32609b;
                if (animator.equals(chatActivityEnterView6.f24010r2)) {
                    chatActivityEnterView6.f24010r2 = null;
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
        switch (this.f32608a) {
            case 0:
                this.f32609b.f23915b0.setVisibility(8);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f32609b;
                ke keVar = chatActivityEnterView.f23935e1;
                if (keVar != null) {
                    keVar.setVisibility(8);
                }
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                chatActivityEnterView.v0();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f32609b;
                if (animator.equals(chatActivityEnterView2.f24016s2)) {
                    chatActivityEnterView2.f23998p1.setVisibility(8);
                    chatActivityEnterView2.f24016s2 = null;
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f32609b;
                if (animator.equals(chatActivityEnterView3.f24010r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    bf bfVar = chatActivityEnterView3.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView3.f24010r2 = null;
                    chatActivityEnterView3.f24031v2 = 0;
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f32609b;
                if (animator.equals(chatActivityEnterView4.f24016s2)) {
                    chatActivityEnterView4.f24016s2 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f32609b;
                if (animator.equals(chatActivityEnterView5.f24010r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.f24010r2 = null;
                    chatActivityEnterView5.f24031v2 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f32609b;
                if (animator.equals(chatActivityEnterView6.f24016s2)) {
                    chatActivityEnterView6.f24016s2 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f32609b;
                if (animator.equals(chatActivityEnterView7.f24010r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f24010r2 = null;
                    chatActivityEnterView7.f24031v2 = 0;
                    ue ueVar = chatActivityEnterView7.Z0;
                    if (ueVar != null) {
                        ueVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ve veVar = this.f32609b.f23916b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    veVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                ve veVar2 = this.f32609b.f23916b1;
                if (veVar2 != null) {
                    veVar2.setAlpha(1.0f);
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.f32609b;
                chatActivityEnterView8.V0 = null;
                og ogVar = chatActivityEnterView8.Z2;
                if (ogVar != null) {
                    ogVar.z(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.f32609b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.f32609b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.unlock();
                return;
        }
    }
}
