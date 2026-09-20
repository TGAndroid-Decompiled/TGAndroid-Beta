package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f30808a;
    public final float f30809b;
    public final float f30810c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f30811f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f30811f = chatActivityEnterView;
        this.f30808a = z10;
        this.f30809b = f7;
        this.f30810c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30811f;
        boolean z10 = this.f30808a;
        if (z10) {
            int i11 = ChatActivityEnterView.f21952m5;
            chatActivityEnterView.b0();
        }
        jp0 jp0Var = chatActivityEnterView.f22040p0;
        if (jp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jp0Var.setVisibility(i10);
            chatActivityEnterView.f22040p0.setAlpha(this.d);
            chatActivityEnterView.f22040p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22040p0.getTranslationX();
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
        if (!this.f30808a) {
            ChatActivityEnterView chatActivityEnterView = this.f30811f;
            jp0 jp0Var = chatActivityEnterView.f22040p0;
            if (jp0Var != null) {
                jp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f30808a;
        ChatActivityEnterView chatActivityEnterView = this.f30811f;
        if (z10) {
            int i10 = ChatActivityEnterView.f21952m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f22040p0.setVisibility(0);
        }
        jp0 jp0Var = chatActivityEnterView.f22040p0;
        if (jp0Var != null) {
            jp0Var.setAlpha(this.f30809b);
            chatActivityEnterView.f22040p0.setTranslationX(this.f30810c);
            f7 = chatActivityEnterView.f22040p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.c0 c0Var = chatActivityEnterView.f22021l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
