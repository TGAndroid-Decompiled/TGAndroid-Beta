package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg extends AnimatorListenerAdapter {
    public final boolean f25689a;
    public final float f25690b;
    public final float f25691c;
    public final float d;
    public final float f25692e;
    public final ChatActivityEnterView f25693f;

    public eg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25693f = chatActivityEnterView;
        this.f25689a = z10;
        this.f25690b = f7;
        this.f25691c = f10;
        this.d = f11;
        this.f25692e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25693f;
        boolean z10 = this.f25689a;
        if (z10) {
            int i11 = ChatActivityEnterView.Q5;
            chatActivityEnterView.c0();
        }
        hq0 hq0Var = chatActivityEnterView.f23707p0;
        if (hq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hq0Var.setVisibility(i10);
            chatActivityEnterView.f23707p0.setAlpha(this.d);
            chatActivityEnterView.f23707p0.setTranslationX(this.f25692e);
            f7 = chatActivityEnterView.f23707p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.M1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25689a) {
            ChatActivityEnterView chatActivityEnterView = this.f25693f;
            hq0 hq0Var = chatActivityEnterView.f23707p0;
            if (hq0Var != null) {
                hq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.M1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25689a;
        ChatActivityEnterView chatActivityEnterView = this.f25693f;
        if (z10) {
            int i10 = ChatActivityEnterView.Q5;
            chatActivityEnterView.c0();
            chatActivityEnterView.f23707p0.setVisibility(0);
        }
        hq0 hq0Var = chatActivityEnterView.f23707p0;
        if (hq0Var != null) {
            hq0Var.setAlpha(this.f25690b);
            chatActivityEnterView.f23707p0.setTranslationX(this.f25691c);
            f7 = chatActivityEnterView.f23707p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.M1();
        ei.c0 c0Var = chatActivityEnterView.f23685l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
