package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f22653a;
    public final float f22654b;
    public final float f22655c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f22656f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f22656f = chatActivityEnterView;
        this.f22653a = z10;
        this.f22654b = f7;
        this.f22655c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f22656f;
        boolean z10 = this.f22653a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21938n5;
            chatActivityEnterView.b0();
        }
        jp0 jp0Var = chatActivityEnterView.f22027p0;
        if (jp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jp0Var.setVisibility(i10);
            chatActivityEnterView.f22027p0.setAlpha(this.d);
            chatActivityEnterView.f22027p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22027p0.getTranslationX();
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
        if (!this.f22653a) {
            ChatActivityEnterView chatActivityEnterView = this.f22656f;
            jp0 jp0Var = chatActivityEnterView.f22027p0;
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
        boolean z10 = this.f22653a;
        ChatActivityEnterView chatActivityEnterView = this.f22656f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21938n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22027p0.setVisibility(0);
        }
        jp0 jp0Var = chatActivityEnterView.f22027p0;
        if (jp0Var != null) {
            jp0Var.setAlpha(this.f22654b);
            chatActivityEnterView.f22027p0.setTranslationX(this.f22655c);
            f7 = chatActivityEnterView.f22027p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        ei.c0 c0Var = chatActivityEnterView.f22007l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
