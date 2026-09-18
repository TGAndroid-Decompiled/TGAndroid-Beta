package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final boolean f30195a;
    public final float f30196b;
    public final float f30197c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f30198f;

    public yf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f30198f = chatActivityEnterView;
        this.f30195a = z10;
        this.f30196b = f7;
        this.f30197c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30198f;
        boolean z10 = this.f30195a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21743n5;
            chatActivityEnterView.c0();
        }
        xo0 xo0Var = chatActivityEnterView.f21832p0;
        if (xo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xo0Var.setVisibility(i10);
            chatActivityEnterView.f21832p0.setAlpha(this.d);
            chatActivityEnterView.f21832p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f21832p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30195a) {
            ChatActivityEnterView chatActivityEnterView = this.f30198f;
            xo0 xo0Var = chatActivityEnterView.f21832p0;
            if (xo0Var != null) {
                xo0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f30195a;
        ChatActivityEnterView chatActivityEnterView = this.f30198f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21743n5;
            chatActivityEnterView.c0();
            chatActivityEnterView.f21832p0.setVisibility(0);
        }
        xo0 xo0Var = chatActivityEnterView.f21832p0;
        if (xo0Var != null) {
            xo0Var.setAlpha(this.f30196b);
            chatActivityEnterView.f21832p0.setTranslationX(this.f30197c);
            f7 = chatActivityEnterView.f21832p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        ei.c0 c0Var = chatActivityEnterView.f21812l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
