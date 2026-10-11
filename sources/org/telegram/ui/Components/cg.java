package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg extends AnimatorListenerAdapter {
    public final boolean f25342a;
    public final float f25343b;
    public final float f25344c;
    public final float d;
    public final float f25345e;
    public final ChatActivityEnterView f25346f;

    public cg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25346f = chatActivityEnterView;
        this.f25342a = z10;
        this.f25343b = f7;
        this.f25344c = f10;
        this.d = f11;
        this.f25345e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25346f;
        boolean z10 = this.f25342a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23878n5;
            chatActivityEnterView.Z();
        }
        cq0 cq0Var = chatActivityEnterView.f23968p0;
        if (cq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            cq0Var.setVisibility(i10);
            chatActivityEnterView.f23968p0.setAlpha(this.d);
            chatActivityEnterView.f23968p0.setTranslationX(this.f25345e);
            f7 = chatActivityEnterView.f23968p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25342a) {
            ChatActivityEnterView chatActivityEnterView = this.f25346f;
            cq0 cq0Var = chatActivityEnterView.f23968p0;
            if (cq0Var != null) {
                cq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.H1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25342a;
        ChatActivityEnterView chatActivityEnterView = this.f25346f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23878n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23968p0.setVisibility(0);
        }
        cq0 cq0Var = chatActivityEnterView.f23968p0;
        if (cq0Var != null) {
            cq0Var.setAlpha(this.f25343b);
            chatActivityEnterView.f23968p0.setTranslationX(this.f25344c);
            f7 = chatActivityEnterView.f23968p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        ei.c0 c0Var = chatActivityEnterView.f23948l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
