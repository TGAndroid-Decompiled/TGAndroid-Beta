package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f42750a;
    public final float f42751b;
    public final float f42752c;
    public final float d;
    public final float f42753e;
    public final ChatActivityEnterView f42754f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f42754f = chatActivityEnterView;
        this.f42750a = z10;
        this.f42751b = f10;
        this.f42752c = f11;
        this.d = f12;
        this.f42753e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f42754f;
        boolean z10 = this.f42750a;
        if (z10) {
            int i10 = ChatActivityEnterView.f32535s7;
            chatActivityEnterView.h0();
        }
        rn0 rn0Var = chatActivityEnterView.f32662q0;
        if (rn0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            rn0Var.setVisibility(i7);
            chatActivityEnterView.f32662q0.setAlpha(this.d);
            chatActivityEnterView.f32662q0.setTranslationX(this.f42753e);
            f10 = chatActivityEnterView.f32662q0.getTranslationX();
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
        if (!this.f42750a) {
            ChatActivityEnterView chatActivityEnterView = this.f42754f;
            rn0 rn0Var = chatActivityEnterView.f32662q0;
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
        boolean z10 = this.f42750a;
        ChatActivityEnterView chatActivityEnterView = this.f42754f;
        if (z10) {
            int i7 = ChatActivityEnterView.f32535s7;
            chatActivityEnterView.h0();
            chatActivityEnterView.f32662q0.setVisibility(0);
        }
        rn0 rn0Var = chatActivityEnterView.f32662q0;
        if (rn0Var != null) {
            rn0Var.setAlpha(this.f42751b);
            chatActivityEnterView.f32662q0.setTranslationX(this.f42752c);
            f10 = chatActivityEnterView.f32662q0.getTranslationX();
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
