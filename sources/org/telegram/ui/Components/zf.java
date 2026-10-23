package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f33209a;
    public final float f33210b;
    public final float f33211c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f33212f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f33212f = chatActivityEnterView;
        this.f33209a = z10;
        this.f33210b = f7;
        this.f33211c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f33212f;
        boolean z10 = this.f33209a;
        if (z10) {
            int i11 = ChatActivityEnterView.f24050r5;
            chatActivityEnterView.Y();
        }
        xp0 xp0Var = chatActivityEnterView.f24142p0;
        if (xp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xp0Var.setVisibility(i10);
            chatActivityEnterView.f24142p0.setAlpha(this.d);
            chatActivityEnterView.f24142p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f24142p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33209a) {
            ChatActivityEnterView chatActivityEnterView = this.f33212f;
            xp0 xp0Var = chatActivityEnterView.f24142p0;
            if (xp0Var != null) {
                xp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f33209a;
        ChatActivityEnterView chatActivityEnterView = this.f33212f;
        if (z10) {
            int i10 = ChatActivityEnterView.f24050r5;
            chatActivityEnterView.Y();
            chatActivityEnterView.f24142p0.setVisibility(0);
        }
        xp0 xp0Var = chatActivityEnterView.f24142p0;
        if (xp0Var != null) {
            xp0Var.setAlpha(this.f33210b);
            chatActivityEnterView.f24142p0.setTranslationX(this.f33211c);
            f7 = chatActivityEnterView.f24142p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f24120l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
