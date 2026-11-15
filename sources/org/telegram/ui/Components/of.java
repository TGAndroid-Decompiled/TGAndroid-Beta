package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of extends AnimatorListenerAdapter {
    public final boolean f37935a;
    public final float f37936b;
    public final float f37937c;
    public final float d;
    public final float f37938e;
    public final ChatActivityEnterView f37939f;

    public of(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f37939f = chatActivityEnterView;
        this.f37935a = z10;
        this.f37936b = f10;
        this.f37937c = f11;
        this.d = f12;
        this.f37938e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37939f;
        boolean z10 = this.f37935a;
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
            chatActivityEnterView.f32265q0.setTranslationX(this.f37938e);
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
        if (!this.f37935a) {
            ChatActivityEnterView chatActivityEnterView = this.f37939f;
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
        boolean z10 = this.f37935a;
        ChatActivityEnterView chatActivityEnterView = this.f37939f;
        if (z10) {
            int i7 = ChatActivityEnterView.N6;
            chatActivityEnterView.f0();
            chatActivityEnterView.f32265q0.setVisibility(0);
        }
        gn0 gn0Var = chatActivityEnterView.f32265q0;
        if (gn0Var != null) {
            gn0Var.setAlpha(this.f37936b);
            chatActivityEnterView.f32265q0.setTranslationX(this.f37937c);
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
