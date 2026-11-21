package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f33498a;
    public final float f33499b;
    public final float f33500c;
    public final float d;
    public final float f33501e;
    public final ChatActivityEnterView f33502f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f33502f = chatActivityEnterView;
        this.f33498a = z10;
        this.f33499b = f10;
        this.f33500c = f11;
        this.d = f12;
        this.f33501e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33502f;
        boolean z10 = this.f33498a;
        if (z10) {
            int i10 = ChatActivityEnterView.f32566s7;
            chatActivityEnterView.h0();
        }
        rn0 rn0Var = chatActivityEnterView.f32693q0;
        if (rn0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            rn0Var.setVisibility(i7);
            chatActivityEnterView.f32693q0.setAlpha(this.d);
            chatActivityEnterView.f32693q0.setTranslationX(this.f33501e);
            f10 = chatActivityEnterView.f32693q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.q2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33498a) {
            ChatActivityEnterView chatActivityEnterView = this.f33502f;
            rn0 rn0Var = chatActivityEnterView.f32693q0;
            if (rn0Var != null) {
                rn0Var.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.q2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f33498a;
        ChatActivityEnterView chatActivityEnterView = this.f33502f;
        if (z10) {
            int i7 = ChatActivityEnterView.f32566s7;
            chatActivityEnterView.h0();
            chatActivityEnterView.f32693q0.setVisibility(0);
        }
        rn0 rn0Var = chatActivityEnterView.f32693q0;
        if (rn0Var != null) {
            rn0Var.setAlpha(this.f33499b);
            chatActivityEnterView.f32693q0.setTranslationX(this.f33500c);
            f10 = chatActivityEnterView.f32693q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.q2();
        ki.y yVar = chatActivityEnterView.m0;
        if (yVar != null && yVar.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
