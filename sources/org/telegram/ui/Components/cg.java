package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg extends AnimatorListenerAdapter {
    public final boolean f25289a;
    public final float f25290b;
    public final float f25291c;
    public final float d;
    public final float f25292e;
    public final ChatActivityEnterView f25293f;

    public cg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25293f = chatActivityEnterView;
        this.f25289a = z10;
        this.f25290b = f7;
        this.f25291c = f10;
        this.d = f11;
        this.f25292e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25293f;
        boolean z10 = this.f25289a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23854n5;
            chatActivityEnterView.Z();
        }
        cq0 cq0Var = chatActivityEnterView.f23944p0;
        if (cq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            cq0Var.setVisibility(i10);
            chatActivityEnterView.f23944p0.setAlpha(this.d);
            chatActivityEnterView.f23944p0.setTranslationX(this.f25292e);
            f7 = chatActivityEnterView.f23944p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25289a) {
            ChatActivityEnterView chatActivityEnterView = this.f25293f;
            cq0 cq0Var = chatActivityEnterView.f23944p0;
            if (cq0Var != null) {
                cq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.H1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25289a;
        ChatActivityEnterView chatActivityEnterView = this.f25293f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23854n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23944p0.setVisibility(0);
        }
        cq0 cq0Var = chatActivityEnterView.f23944p0;
        if (cq0Var != null) {
            cq0Var.setAlpha(this.f25290b);
            chatActivityEnterView.f23944p0.setTranslationX(this.f25291c);
            f7 = chatActivityEnterView.f23944p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        ei.c0 c0Var = chatActivityEnterView.f23924l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
