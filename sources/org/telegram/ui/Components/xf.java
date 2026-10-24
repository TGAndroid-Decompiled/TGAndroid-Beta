package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf extends AnimatorListenerAdapter {
    public final boolean f32569a;
    public final float f32570b;
    public final float f32571c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f32572f;

    public xf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f32572f = chatActivityEnterView;
        this.f32569a = z10;
        this.f32570b = f7;
        this.f32571c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32572f;
        boolean z10 = this.f32569a;
        if (z10) {
            int i11 = ChatActivityEnterView.f24051r5;
            chatActivityEnterView.Y();
        }
        wp0 wp0Var = chatActivityEnterView.f24143p0;
        if (wp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wp0Var.setVisibility(i10);
            chatActivityEnterView.f24143p0.setAlpha(this.d);
            chatActivityEnterView.f24143p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f24143p0.getTranslationX();
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
        if (!this.f32569a) {
            ChatActivityEnterView chatActivityEnterView = this.f32572f;
            wp0 wp0Var = chatActivityEnterView.f24143p0;
            if (wp0Var != null) {
                wp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f32569a;
        ChatActivityEnterView chatActivityEnterView = this.f32572f;
        if (z10) {
            int i10 = ChatActivityEnterView.f24051r5;
            chatActivityEnterView.Y();
            chatActivityEnterView.f24143p0.setVisibility(0);
        }
        wp0 wp0Var = chatActivityEnterView.f24143p0;
        if (wp0Var != null) {
            wp0Var.setAlpha(this.f32570b);
            chatActivityEnterView.f24143p0.setTranslationX(this.f32571c);
            f7 = chatActivityEnterView.f24143p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f24121l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
