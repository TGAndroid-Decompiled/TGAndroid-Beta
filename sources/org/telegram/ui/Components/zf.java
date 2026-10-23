package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f32889a;
    public final float f32890b;
    public final float f32891c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f32892f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f32892f = chatActivityEnterView;
        this.f32889a = z10;
        this.f32890b = f7;
        this.f32891c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32892f;
        boolean z10 = this.f32889a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23912n5;
            chatActivityEnterView.Z();
        }
        tp0 tp0Var = chatActivityEnterView.f24002p0;
        if (tp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            tp0Var.setVisibility(i10);
            chatActivityEnterView.f24002p0.setAlpha(this.d);
            chatActivityEnterView.f24002p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f24002p0.getTranslationX();
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
        if (!this.f32889a) {
            ChatActivityEnterView chatActivityEnterView = this.f32892f;
            tp0 tp0Var = chatActivityEnterView.f24002p0;
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
        boolean z10 = this.f32889a;
        ChatActivityEnterView chatActivityEnterView = this.f32892f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23912n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f24002p0.setVisibility(0);
        }
        tp0 tp0Var = chatActivityEnterView.f24002p0;
        if (tp0Var != null) {
            tp0Var.setAlpha(this.f32890b);
            chatActivityEnterView.f24002p0.setTranslationX(this.f32891c);
            f7 = chatActivityEnterView.f24002p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        gi.b0 b0Var = chatActivityEnterView.f23982l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
