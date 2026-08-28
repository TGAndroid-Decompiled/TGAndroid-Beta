package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final boolean f31926a;
    public final float f31927b;
    public final float f31928c;
    public final float d;
    public final float f31929e;
    public final ChatActivityEnterView f31930f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f31930f = chatActivityEnterView;
        this.f31926a = z10;
        this.f31927b = f10;
        this.f31928c = f11;
        this.d = f12;
        this.f31929e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i9;
        ChatActivityEnterView chatActivityEnterView = this.f31930f;
        boolean z10 = this.f31926a;
        if (z10) {
            int i10 = ChatActivityEnterView.f26074i5;
            chatActivityEnterView.a0();
        }
        fo0 fo0Var = chatActivityEnterView.f26141l0;
        if (fo0Var != null) {
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            fo0Var.setVisibility(i9);
            chatActivityEnterView.f26141l0.setAlpha(this.d);
            chatActivityEnterView.f26141l0.setTranslationX(this.f31929e);
            f10 = chatActivityEnterView.f26141l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f31926a) {
            ChatActivityEnterView chatActivityEnterView = this.f31930f;
            fo0 fo0Var = chatActivityEnterView.f26141l0;
            if (fo0Var != null) {
                fo0Var.setVisibility(8);
            }
            chatActivityEnterView.M0.setTranslationX(0.0f);
            chatActivityEnterView.C = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f31926a;
        ChatActivityEnterView chatActivityEnterView = this.f31930f;
        if (z10) {
            int i9 = ChatActivityEnterView.f26074i5;
            chatActivityEnterView.a0();
            chatActivityEnterView.f26141l0.setVisibility(0);
        }
        fo0 fo0Var = chatActivityEnterView.f26141l0;
        if (fo0Var != null) {
            fo0Var.setAlpha(this.f31927b);
            chatActivityEnterView.f26141l0.setTranslationX(this.f31928c);
            f10 = chatActivityEnterView.f26141l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.J1();
        mh.c0 c0Var = chatActivityEnterView.f26120h0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.f26203x0.clear();
        }
    }
}
