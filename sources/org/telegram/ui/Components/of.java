package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of extends AnimatorListenerAdapter {
    public final boolean f37933a;
    public final float f37934b;
    public final float f37935c;
    public final float d;
    public final float f37936e;
    public final ChatActivityEnterView f37937f;

    public of(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f37937f = chatActivityEnterView;
        this.f37933a = z10;
        this.f37934b = f10;
        this.f37935c = f11;
        this.d = f12;
        this.f37936e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37937f;
        boolean z10 = this.f37933a;
        if (z10) {
            int i10 = ChatActivityEnterView.N6;
            chatActivityEnterView.f0();
        }
        gn0 gn0Var = chatActivityEnterView.f32265q0;
        if (gn0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            gn0Var.setVisibility(i7);
            chatActivityEnterView.f32265q0.setAlpha(this.d);
            chatActivityEnterView.f32265q0.setTranslationX(this.f37936e);
            f10 = chatActivityEnterView.f32265q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.d2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f37933a) {
            ChatActivityEnterView chatActivityEnterView = this.f37937f;
            gn0 gn0Var = chatActivityEnterView.f32265q0;
            if (gn0Var != null) {
                gn0Var.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.d2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f37933a;
        ChatActivityEnterView chatActivityEnterView = this.f37937f;
        if (z10) {
            int i7 = ChatActivityEnterView.N6;
            chatActivityEnterView.f0();
            chatActivityEnterView.f32265q0.setVisibility(0);
        }
        gn0 gn0Var = chatActivityEnterView.f32265q0;
        if (gn0Var != null) {
            gn0Var.setAlpha(this.f37934b);
            chatActivityEnterView.f32265q0.setTranslationX(this.f37935c);
            f10 = chatActivityEnterView.f32265q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.d2();
        ki.a0 a0Var = chatActivityEnterView.m0;
        if (a0Var != null && a0Var.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
