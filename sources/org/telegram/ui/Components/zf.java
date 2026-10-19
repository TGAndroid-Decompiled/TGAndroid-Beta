package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f32915a;
    public final float f32916b;
    public final float f32917c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f32918f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f32918f = chatActivityEnterView;
        this.f32915a = z10;
        this.f32916b = f7;
        this.f32917c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32918f;
        boolean z10 = this.f32915a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23907n5;
            chatActivityEnterView.Z();
        }
        sp0 sp0Var = chatActivityEnterView.f23997p0;
        if (sp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            sp0Var.setVisibility(i10);
            chatActivityEnterView.f23997p0.setAlpha(this.d);
            chatActivityEnterView.f23997p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f23997p0.getTranslationX();
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
        if (!this.f32915a) {
            ChatActivityEnterView chatActivityEnterView = this.f32918f;
            sp0 sp0Var = chatActivityEnterView.f23997p0;
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
        boolean z10 = this.f32915a;
        ChatActivityEnterView chatActivityEnterView = this.f32918f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23907n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23997p0.setVisibility(0);
        }
        sp0 sp0Var = chatActivityEnterView.f23997p0;
        if (sp0Var != null) {
            sp0Var.setAlpha(this.f32916b);
            chatActivityEnterView.f23997p0.setTranslationX(this.f32917c);
            f7 = chatActivityEnterView.f23997p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f23977l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
