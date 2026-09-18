package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f30779a;
    public final float f30780b;
    public final float f30781c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f30782f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f30782f = chatActivityEnterView;
        this.f30779a = z10;
        this.f30780b = f7;
        this.f30781c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30782f;
        boolean z10 = this.f30779a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21917m5;
            chatActivityEnterView.b0();
        }
        kp0 kp0Var = chatActivityEnterView.f22005p0;
        if (kp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kp0Var.setVisibility(i10);
            chatActivityEnterView.f22005p0.setAlpha(this.d);
            chatActivityEnterView.f22005p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22005p0.getTranslationX();
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
        if (!this.f30779a) {
            ChatActivityEnterView chatActivityEnterView = this.f30782f;
            kp0 kp0Var = chatActivityEnterView.f22005p0;
            if (kp0Var != null) {
                kp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f30779a;
        ChatActivityEnterView chatActivityEnterView = this.f30782f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21917m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22005p0.setVisibility(0);
        }
        kp0 kp0Var = chatActivityEnterView.f22005p0;
        if (kp0Var != null) {
            kp0Var.setAlpha(this.f30780b);
            chatActivityEnterView.f22005p0.setTranslationX(this.f30781c);
            f7 = chatActivityEnterView.f22005p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.c0 c0Var = chatActivityEnterView.f21986l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
