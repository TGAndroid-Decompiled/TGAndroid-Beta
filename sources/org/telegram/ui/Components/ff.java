package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff extends AnimatorListenerAdapter {
    public final boolean f33785a;
    public final float f33786b;
    public final float f33787c;
    public final float d;
    public final float f33788e;
    public final ChatActivityEnterView f33789f;

    public ff(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f33789f = chatActivityEnterView;
        this.f33785a = z10;
        this.f33786b = f10;
        this.f33787c = f11;
        this.d = f12;
        this.f33788e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i3;
        ChatActivityEnterView chatActivityEnterView = this.f33789f;
        boolean z10 = this.f33785a;
        if (z10) {
            int i10 = ChatActivityEnterView.f31082t5;
            chatActivityEnterView.X();
        }
        fn0 fn0Var = chatActivityEnterView.f31179q0;
        if (fn0Var != null) {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            fn0Var.setVisibility(i3);
            chatActivityEnterView.f31179q0.setAlpha(this.d);
            chatActivityEnterView.f31179q0.setTranslationX(this.f33788e);
            f10 = chatActivityEnterView.f31179q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.K1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33785a) {
            ChatActivityEnterView chatActivityEnterView = this.f33789f;
            fn0 fn0Var = chatActivityEnterView.f31179q0;
            if (fn0Var != null) {
                fn0Var.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.K1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f33785a;
        ChatActivityEnterView chatActivityEnterView = this.f33789f;
        if (z10) {
            int i3 = ChatActivityEnterView.f31082t5;
            chatActivityEnterView.X();
            chatActivityEnterView.f31179q0.setVisibility(0);
        }
        fn0 fn0Var = chatActivityEnterView.f31179q0;
        if (fn0Var != null) {
            fn0Var.setAlpha(this.f33786b);
            chatActivityEnterView.f31179q0.setTranslationX(this.f33787c);
            f10 = chatActivityEnterView.f31179q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.K1();
        ii.a0 a0Var = chatActivityEnterView.m0;
        if (a0Var != null && a0Var.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
