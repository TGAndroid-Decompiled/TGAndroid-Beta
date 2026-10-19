package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f32913a;
    public final float f32914b;
    public final float f32915c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f32916f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f32916f = chatActivityEnterView;
        this.f32913a = z10;
        this.f32914b = f7;
        this.f32915c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32916f;
        boolean z10 = this.f32913a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23905n5;
            chatActivityEnterView.Z();
        }
        sp0 sp0Var = chatActivityEnterView.f23995p0;
        if (sp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            sp0Var.setVisibility(i10);
            chatActivityEnterView.f23995p0.setAlpha(this.d);
            chatActivityEnterView.f23995p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f23995p0.getTranslationX();
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
        if (!this.f32913a) {
            ChatActivityEnterView chatActivityEnterView = this.f32916f;
            sp0 sp0Var = chatActivityEnterView.f23995p0;
            if (sp0Var != null) {
                sp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f32913a;
        ChatActivityEnterView chatActivityEnterView = this.f32916f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23905n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23995p0.setVisibility(0);
        }
        sp0 sp0Var = chatActivityEnterView.f23995p0;
        if (sp0Var != null) {
            sp0Var.setAlpha(this.f32914b);
            chatActivityEnterView.f23995p0.setTranslationX(this.f32915c);
            f7 = chatActivityEnterView.f23995p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f23975l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
