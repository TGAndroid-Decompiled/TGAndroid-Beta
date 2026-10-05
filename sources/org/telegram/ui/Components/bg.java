package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f24963a;
    public final float f24964b;
    public final float f24965c;
    public final float d;
    public final float f24966e;
    public final ChatActivityEnterView f24967f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f24967f = chatActivityEnterView;
        this.f24963a = z10;
        this.f24964b = f7;
        this.f24965c = f10;
        this.d = f11;
        this.f24966e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24967f;
        boolean z10 = this.f24963a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23854n5;
            chatActivityEnterView.b0();
        }
        qp0 qp0Var = chatActivityEnterView.f23944p0;
        if (qp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qp0Var.setVisibility(i10);
            chatActivityEnterView.f23944p0.setAlpha(this.d);
            chatActivityEnterView.f23944p0.setTranslationX(this.f24966e);
            f7 = chatActivityEnterView.f23944p0.getTranslationX();
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
        if (!this.f24963a) {
            ChatActivityEnterView chatActivityEnterView = this.f24967f;
            qp0 qp0Var = chatActivityEnterView.f23944p0;
            if (qp0Var != null) {
                qp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f24963a;
        ChatActivityEnterView chatActivityEnterView = this.f24967f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23854n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f23944p0.setVisibility(0);
        }
        qp0 qp0Var = chatActivityEnterView.f23944p0;
        if (qp0Var != null) {
            qp0Var.setAlpha(this.f24964b);
            chatActivityEnterView.f23944p0.setTranslationX(this.f24965c);
            f7 = chatActivityEnterView.f23944p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.d0 d0Var = chatActivityEnterView.f23924l0;
        if (d0Var != null && d0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
