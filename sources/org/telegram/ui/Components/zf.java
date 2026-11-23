package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f42841a;
    public final float f42842b;
    public final float f42843c;
    public final float d;
    public final float f42844e;
    public final ChatActivityEnterView f42845f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f42845f = chatActivityEnterView;
        this.f42841a = z10;
        this.f42842b = f10;
        this.f42843c = f11;
        this.d = f12;
        this.f42844e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f42845f;
        boolean z10 = this.f42841a;
        if (z10) {
            int i10 = ChatActivityEnterView.f32633s7;
            chatActivityEnterView.h0();
        }
        qn0 qn0Var = chatActivityEnterView.f32760q0;
        if (qn0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            qn0Var.setVisibility(i7);
            chatActivityEnterView.f32760q0.setAlpha(this.d);
            chatActivityEnterView.f32760q0.setTranslationX(this.f42844e);
            f10 = chatActivityEnterView.f32760q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.s2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f42841a) {
            ChatActivityEnterView chatActivityEnterView = this.f42845f;
            qn0 qn0Var = chatActivityEnterView.f32760q0;
            if (qn0Var != null) {
                qn0Var.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.s2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.f42841a;
        ChatActivityEnterView chatActivityEnterView = this.f42845f;
        if (z10) {
            int i7 = ChatActivityEnterView.f32633s7;
            chatActivityEnterView.h0();
            chatActivityEnterView.f32760q0.setVisibility(0);
        }
        qn0 qn0Var = chatActivityEnterView.f32760q0;
        if (qn0Var != null) {
            qn0Var.setAlpha(this.f42842b);
            chatActivityEnterView.f32760q0.setTranslationX(this.f42843c);
            f10 = chatActivityEnterView.f32760q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.s2();
        ki.y yVar = chatActivityEnterView.m0;
        if (yVar != null && yVar.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
