package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f22672a;
    public final float f22673b;
    public final float f22674c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f22675f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f22675f = chatActivityEnterView;
        this.f22672a = z10;
        this.f22673b = f7;
        this.f22674c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f22675f;
        boolean z10 = this.f22672a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21953n5;
            chatActivityEnterView.b0();
        }
        jp0 jp0Var = chatActivityEnterView.f22042p0;
        if (jp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jp0Var.setVisibility(i10);
            chatActivityEnterView.f22042p0.setAlpha(this.d);
            chatActivityEnterView.f22042p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22042p0.getTranslationX();
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
        if (!this.f22672a) {
            ChatActivityEnterView chatActivityEnterView = this.f22675f;
            jp0 jp0Var = chatActivityEnterView.f22042p0;
            if (jp0Var != null) {
                jp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f22672a;
        ChatActivityEnterView chatActivityEnterView = this.f22675f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21953n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22042p0.setVisibility(0);
        }
        jp0 jp0Var = chatActivityEnterView.f22042p0;
        if (jp0Var != null) {
            jp0Var.setAlpha(this.f22673b);
            chatActivityEnterView.f22042p0.setTranslationX(this.f22674c);
            f7 = chatActivityEnterView.f22042p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        ei.c0 c0Var = chatActivityEnterView.f22022l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
