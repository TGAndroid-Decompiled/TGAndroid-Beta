package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f22930a;
    public final float f22931b;
    public final float f22932c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f22933f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f22933f = chatActivityEnterView;
        this.f22930a = z10;
        this.f22931b = f7;
        this.f22932c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f22933f;
        boolean z10 = this.f22930a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21974n5;
            chatActivityEnterView.b0();
        }
        mp0 mp0Var = chatActivityEnterView.f22063p0;
        if (mp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            mp0Var.setVisibility(i10);
            chatActivityEnterView.f22063p0.setAlpha(this.d);
            chatActivityEnterView.f22063p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22063p0.getTranslationX();
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
        if (!this.f22930a) {
            ChatActivityEnterView chatActivityEnterView = this.f22933f;
            mp0 mp0Var = chatActivityEnterView.f22063p0;
            if (mp0Var != null) {
                mp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f22930a;
        ChatActivityEnterView chatActivityEnterView = this.f22933f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21974n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22063p0.setVisibility(0);
        }
        mp0 mp0Var = chatActivityEnterView.f22063p0;
        if (mp0Var != null) {
            mp0Var.setAlpha(this.f22931b);
            chatActivityEnterView.f22063p0.setTranslationX(this.f22932c);
            f7 = chatActivityEnterView.f22063p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        ei.c0 c0Var = chatActivityEnterView.f22043l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
