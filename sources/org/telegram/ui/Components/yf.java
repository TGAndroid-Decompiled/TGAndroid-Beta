package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final boolean f30235a;
    public final float f30236b;
    public final float f30237c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f30238f;

    public yf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f30238f = chatActivityEnterView;
        this.f30235a = z10;
        this.f30236b = f7;
        this.f30237c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30238f;
        boolean z10 = this.f30235a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21731m5;
            chatActivityEnterView.b0();
        }
        wo0 wo0Var = chatActivityEnterView.f21819p0;
        if (wo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wo0Var.setVisibility(i10);
            chatActivityEnterView.f21819p0.setAlpha(this.d);
            chatActivityEnterView.f21819p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f21819p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30235a) {
            ChatActivityEnterView chatActivityEnterView = this.f30238f;
            wo0 wo0Var = chatActivityEnterView.f21819p0;
            if (wo0Var != null) {
                wo0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f30235a;
        ChatActivityEnterView chatActivityEnterView = this.f30238f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21731m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f21819p0.setVisibility(0);
        }
        wo0 wo0Var = chatActivityEnterView.f21819p0;
        if (wo0Var != null) {
            wo0Var.setAlpha(this.f30236b);
            chatActivityEnterView.f21819p0.setTranslationX(this.f30237c);
            f7 = chatActivityEnterView.f21819p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.c0 c0Var = chatActivityEnterView.f21800l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
