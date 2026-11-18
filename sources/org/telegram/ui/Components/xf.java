package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf extends AnimatorListenerAdapter {
    public final boolean f41994a;
    public final float f41995b;
    public final float f41996c;
    public final float d;
    public final float f41997e;
    public final ChatActivityEnterView f41998f;

    public xf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f41998f = chatActivityEnterView;
        this.f41994a = z10;
        this.f41995b = f10;
        this.f41996c = f11;
        this.d = f12;
        this.f41997e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f41998f;
        boolean z10 = this.f41994a;
        if (z10) {
            int i10 = ChatActivityEnterView.f32538n7;
            chatActivityEnterView.h0();
        }
        pn0 pn0Var = chatActivityEnterView.f32662q0;
        if (pn0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            pn0Var.setVisibility(i7);
            chatActivityEnterView.f32662q0.setAlpha(this.d);
            chatActivityEnterView.f32662q0.setTranslationX(this.f41997e);
            f10 = chatActivityEnterView.f32662q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.m2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f41994a) {
            ChatActivityEnterView chatActivityEnterView = this.f41998f;
            pn0 pn0Var = chatActivityEnterView.f32662q0;
            if (pn0Var != null) {
                pn0Var.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.m2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f41994a;
        ChatActivityEnterView chatActivityEnterView = this.f41998f;
        if (z10) {
            int i7 = ChatActivityEnterView.f32538n7;
            chatActivityEnterView.h0();
            chatActivityEnterView.f32662q0.setVisibility(0);
        }
        pn0 pn0Var = chatActivityEnterView.f32662q0;
        if (pn0Var != null) {
            pn0Var.setAlpha(this.f41995b);
            chatActivityEnterView.f32662q0.setTranslationX(this.f41996c);
            f10 = chatActivityEnterView.f32662q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.m2();
        ki.z zVar = chatActivityEnterView.m0;
        if (zVar != null && zVar.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
