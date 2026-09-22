package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf extends AnimatorListenerAdapter {
    public final boolean f30232a;
    public final float f30233b;
    public final float f30234c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f30235f;

    public yf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f30235f = chatActivityEnterView;
        this.f30232a = z10;
        this.f30233b = f7;
        this.f30234c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30235f;
        boolean z10 = this.f30232a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21727n5;
            chatActivityEnterView.c0();
        }
        wo0 wo0Var = chatActivityEnterView.f21816p0;
        if (wo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wo0Var.setVisibility(i10);
            chatActivityEnterView.f21816p0.setAlpha(this.d);
            chatActivityEnterView.f21816p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f21816p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.K1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30232a) {
            ChatActivityEnterView chatActivityEnterView = this.f30235f;
            wo0 wo0Var = chatActivityEnterView.f21816p0;
            if (wo0Var != null) {
                wo0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.K1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f30232a;
        ChatActivityEnterView chatActivityEnterView = this.f30235f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21727n5;
            chatActivityEnterView.c0();
            chatActivityEnterView.f21816p0.setVisibility(0);
        }
        wo0 wo0Var = chatActivityEnterView.f21816p0;
        if (wo0Var != null) {
            wo0Var.setAlpha(this.f30233b);
            chatActivityEnterView.f21816p0.setTranslationX(this.f30234c);
            f7 = chatActivityEnterView.f21816p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.K1();
        ei.c0 c0Var = chatActivityEnterView.f21796l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
