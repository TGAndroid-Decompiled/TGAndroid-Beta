package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tf extends AnimatorListenerAdapter {
    public final boolean f32941a;
    public final float f32942b;
    public final float f32943c;
    public final float d;
    public final float f32944e;
    public final ChatActivityEnterView f32945f;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f9, float f10, float f11, float f12) {
        this.f32945f = chatActivityEnterView;
        this.f32941a = z10;
        this.f32942b = f9;
        this.f32943c = f10;
        this.d = f11;
        this.f32944e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f9;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f32945f;
        boolean z10 = this.f32941a;
        if (z10) {
            int i11 = ChatActivityEnterView.f26085i5;
            chatActivityEnterView.b0();
        }
        qo0 qo0Var = chatActivityEnterView.f26152l0;
        if (qo0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qo0Var.setVisibility(i10);
            chatActivityEnterView.f26152l0.setAlpha(this.d);
            chatActivityEnterView.f26152l0.setTranslationX(this.f32944e);
            f9 = chatActivityEnterView.f26152l0.getTranslationX();
        } else {
            f9 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f9);
        chatActivityEnterView.C = f9;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f32941a) {
            ChatActivityEnterView chatActivityEnterView = this.f32945f;
            qo0 qo0Var = chatActivityEnterView.f26152l0;
            if (qo0Var != null) {
                qo0Var.setVisibility(8);
            }
            chatActivityEnterView.M0.setTranslationX(0.0f);
            chatActivityEnterView.C = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f9;
        boolean z10 = this.f32941a;
        ChatActivityEnterView chatActivityEnterView = this.f32945f;
        if (z10) {
            int i10 = ChatActivityEnterView.f26085i5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f26152l0.setVisibility(0);
        }
        qo0 qo0Var = chatActivityEnterView.f26152l0;
        if (qo0Var != null) {
            qo0Var.setAlpha(this.f32942b);
            chatActivityEnterView.f26152l0.setTranslationX(this.f32943c);
            f9 = chatActivityEnterView.f26152l0.getTranslationX();
        } else {
            f9 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f9);
        chatActivityEnterView.C = f9;
        chatActivityEnterView.J1();
        ph.z zVar = chatActivityEnterView.f26131h0;
        if (zVar != null && zVar.getTag() == null) {
            chatActivityEnterView.f26215x0.clear();
        }
    }
}
