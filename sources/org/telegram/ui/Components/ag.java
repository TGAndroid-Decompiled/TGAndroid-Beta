package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag extends AnimatorListenerAdapter {
    public final boolean f24363a;
    public final float f24364b;
    public final float f24365c;
    public final float d;
    public final float f24366e;
    public final ChatActivityEnterView f24367f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f24367f = chatActivityEnterView;
        this.f24363a = z10;
        this.f24364b = f7;
        this.f24365c = f10;
        this.d = f11;
        this.f24366e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24367f;
        boolean z10 = this.f24363a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23662m5;
            chatActivityEnterView.b0();
        }
        xo0 xo0Var = chatActivityEnterView.f23751p0;
        if (xo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xo0Var.setVisibility(i10);
            chatActivityEnterView.f23751p0.setAlpha(this.d);
            chatActivityEnterView.f23751p0.setTranslationX(this.f24366e);
            f7 = chatActivityEnterView.f23751p0.getTranslationX();
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
        if (!this.f24363a) {
            ChatActivityEnterView chatActivityEnterView = this.f24367f;
            xo0 xo0Var = chatActivityEnterView.f23751p0;
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
        boolean z10 = this.f24363a;
        ChatActivityEnterView chatActivityEnterView = this.f24367f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23662m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f23751p0.setVisibility(0);
        }
        xo0 xo0Var = chatActivityEnterView.f23751p0;
        if (xo0Var != null) {
            xo0Var.setAlpha(this.f24364b);
            chatActivityEnterView.f23751p0.setTranslationX(this.f24365c);
            f7 = chatActivityEnterView.f23751p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        fi.c0 c0Var = chatActivityEnterView.f23732l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
