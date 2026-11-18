package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ae extends AnimatorListenerAdapter {
    public final int f33335a;
    public final ChatActivityEnterView f33336b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33335a = i7;
        this.f33336b = chatActivityEnterView;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33335a) {
            case 4:
                ChatActivityEnterView chatActivityEnterView = this.f33336b;
                if (animator.equals(chatActivityEnterView.f32594g3)) {
                    chatActivityEnterView.f32594g3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = this.f33336b;
                if (animator.equals(chatActivityEnterView2.f32586f3)) {
                    chatActivityEnterView2.f32586f3 = null;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView3 = this.f33336b;
                if (animator.equals(chatActivityEnterView3.f32594g3)) {
                    chatActivityEnterView3.f32594g3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView4 = this.f33336b;
                if (animator.equals(chatActivityEnterView4.f32586f3)) {
                    chatActivityEnterView4.f32586f3 = null;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView5 = this.f33336b;
                if (animator.equals(chatActivityEnterView5.f32594g3)) {
                    chatActivityEnterView5.f32594g3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView6 = this.f33336b;
                if (animator.equals(chatActivityEnterView6.f32586f3)) {
                    chatActivityEnterView6.f32586f3 = null;
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
        switch (this.f33335a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33336b;
                chatActivityEnterView.f32659p4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f33336b;
                chatActivityEnterView2.f32659p4 = null;
                chatActivityEnterView2.V0.setLayerType(0, null);
                chatActivityEnterView2.f32732z4.e();
                return;
            case 2:
                this.f33336b.f32558c0.setVisibility(8);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.f33336b;
                de deVar = chatActivityEnterView3.f32584f1;
                if (deVar != null) {
                    deVar.setVisibility(8);
                }
                chatActivityEnterView3.n1();
                gf gfVar = chatActivityEnterView3.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                chatActivityEnterView3.S0();
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.f33336b;
                if (animator.equals(chatActivityEnterView4.f32594g3)) {
                    chatActivityEnterView4.d2.setVisibility(8);
                    chatActivityEnterView4.f32594g3 = null;
                    return;
                }
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.f33336b;
                if (animator.equals(chatActivityEnterView5.f32586f3)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.f32541a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView5.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView5.f32586f3 = null;
                    chatActivityEnterView5.j3 = 0;
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.f33336b;
                if (animator.equals(chatActivityEnterView6.f32594g3)) {
                    chatActivityEnterView6.f32594g3 = null;
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.f33336b;
                if (animator.equals(chatActivityEnterView7.f32586f3)) {
                    chatActivityEnterView7.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView7.Q0.setVisibility(8);
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.f32541a1.setVisibility(8);
                    chatActivityEnterView7.T0.setVisibility(0);
                    chatActivityEnterView7.f32586f3 = null;
                    chatActivityEnterView7.j3 = 0;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView8 = this.f33336b;
                if (animator.equals(chatActivityEnterView8.f32594g3)) {
                    chatActivityEnterView8.f32594g3 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView9 = this.f33336b;
                if (animator.equals(chatActivityEnterView9.f32586f3)) {
                    chatActivityEnterView9.setSlowModeButtonVisible(false);
                    chatActivityEnterView9.f32586f3 = null;
                    chatActivityEnterView9.j3 = 0;
                    oe oeVar = chatActivityEnterView9.f32541a1;
                    if (oeVar != null) {
                        oeVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                pe peVar = this.f33336b.f32559c1;
                if (peVar != null) {
                    peVar.setScaleX(1.0f);
                    peVar.setScaleY(1.0f);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView10 = this.f33336b;
                pe peVar2 = chatActivityEnterView10.f32559c1;
                if (peVar2 != null) {
                    peVar2.setAlpha(1.0f);
                }
                oe oeVar2 = chatActivityEnterView10.f32541a1;
                if (oeVar2 != null) {
                    oeVar2.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.f33336b;
                chatActivityEnterView11.W0 = null;
                kg kgVar = chatActivityEnterView11.N3;
                if (kgVar != null) {
                    kgVar.x(0.0f);
                }
                chatActivityEnterView11.requestLayout();
                chatActivityEnterView11.f32732z4.e();
                return;
        }
    }
}
