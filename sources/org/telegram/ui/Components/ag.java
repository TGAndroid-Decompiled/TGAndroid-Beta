package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f22643a;
    public final float f22644b;
    public final float f22645c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f22646f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f22646f = chatActivityEnterView;
        this.f22643a = z10;
        this.f22644b = f7;
        this.f22645c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f22646f;
        boolean z10 = this.f22643a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21954n5;
            chatActivityEnterView.b0();
        }
        lp0 lp0Var = chatActivityEnterView.f22043p0;
        if (lp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            lp0Var.setVisibility(i10);
            chatActivityEnterView.f22043p0.setAlpha(this.d);
            chatActivityEnterView.f22043p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22043p0.getTranslationX();
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
        if (!this.f22643a) {
            ChatActivityEnterView chatActivityEnterView = this.f22646f;
            lp0 lp0Var = chatActivityEnterView.f22043p0;
            if (lp0Var != null) {
                lp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f22643a;
        ChatActivityEnterView chatActivityEnterView = this.f22646f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21954n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22043p0.setVisibility(0);
        }
        lp0 lp0Var = chatActivityEnterView.f22043p0;
        if (lp0Var != null) {
            lp0Var.setAlpha(this.f22644b);
            chatActivityEnterView.f22043p0.setTranslationX(this.f22645c);
            f7 = chatActivityEnterView.f22043p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        ei.c0 c0Var = chatActivityEnterView.f22023l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
