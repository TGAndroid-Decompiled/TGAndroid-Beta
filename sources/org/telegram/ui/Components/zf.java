package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f32885a;
    public final float f32886b;
    public final float f32887c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f32888f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f32888f = chatActivityEnterView;
        this.f32885a = z10;
        this.f32886b = f7;
        this.f32887c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32888f;
        boolean z10 = this.f32885a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23908n5;
            chatActivityEnterView.Z();
        }
        tp0 tp0Var = chatActivityEnterView.f23998p0;
        if (tp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            tp0Var.setVisibility(i10);
            chatActivityEnterView.f23998p0.setAlpha(this.d);
            chatActivityEnterView.f23998p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f23998p0.getTranslationX();
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
        if (!this.f32885a) {
            ChatActivityEnterView chatActivityEnterView = this.f32888f;
            tp0 tp0Var = chatActivityEnterView.f23998p0;
            if (tp0Var != null) {
                tp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f32885a;
        ChatActivityEnterView chatActivityEnterView = this.f32888f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23908n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23998p0.setVisibility(0);
        }
        tp0 tp0Var = chatActivityEnterView.f23998p0;
        if (tp0Var != null) {
            tp0Var.setAlpha(this.f32886b);
            chatActivityEnterView.f23998p0.setTranslationX(this.f32887c);
            f7 = chatActivityEnterView.f23998p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f23978l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
