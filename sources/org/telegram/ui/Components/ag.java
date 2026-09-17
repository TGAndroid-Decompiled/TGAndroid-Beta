package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f24390a;
    public final float f24391b;
    public final float f24392c;
    public final float d;
    public final float f24393e;
    public final ChatActivityEnterView f24394f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f24394f = chatActivityEnterView;
        this.f24390a = z10;
        this.f24391b = f7;
        this.f24392c = f10;
        this.d = f11;
        this.f24393e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24394f;
        boolean z10 = this.f24390a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23689m5;
            chatActivityEnterView.b0();
        }
        xo0 xo0Var = chatActivityEnterView.f23778p0;
        if (xo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xo0Var.setVisibility(i10);
            chatActivityEnterView.f23778p0.setAlpha(this.d);
            chatActivityEnterView.f23778p0.setTranslationX(this.f24393e);
            f7 = chatActivityEnterView.f23778p0.getTranslationX();
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
        if (!this.f24390a) {
            ChatActivityEnterView chatActivityEnterView = this.f24394f;
            xo0 xo0Var = chatActivityEnterView.f23778p0;
            if (xo0Var != null) {
                xo0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f24390a;
        ChatActivityEnterView chatActivityEnterView = this.f24394f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23689m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f23778p0.setVisibility(0);
        }
        xo0 xo0Var = chatActivityEnterView.f23778p0;
        if (xo0Var != null) {
            xo0Var.setAlpha(this.f24391b);
            chatActivityEnterView.f23778p0.setTranslationX(this.f24392c);
            f7 = chatActivityEnterView.f23778p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        fi.c0 c0Var = chatActivityEnterView.f23759l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
