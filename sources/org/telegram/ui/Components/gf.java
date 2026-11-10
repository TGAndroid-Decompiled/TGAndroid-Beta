package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gf extends AnimatorListenerAdapter {
    public final boolean f33883a;
    public final float f33884b;
    public final float f33885c;
    public final float d;
    public final float f33886e;
    public final ChatActivityEnterView f33887f;

    public gf(ChatActivityEnterView chatActivityEnterView, boolean z9, float f10, float f11, float f12, float f13) {
        this.f33887f = chatActivityEnterView;
        this.f33883a = z9;
        this.f33884b = f10;
        this.f33885c = f11;
        this.d = f12;
        this.f33886e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33887f;
        boolean z9 = this.f33883a;
        if (z9) {
            int i10 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
        }
        cn0 cn0Var = chatActivityEnterView.f31119p0;
        if (cn0Var != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            cn0Var.setVisibility(i7);
            chatActivityEnterView.f31119p0.setAlpha(this.d);
            chatActivityEnterView.f31119p0.setTranslationX(this.f33886e);
            f10 = chatActivityEnterView.f31119p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33883a) {
            ChatActivityEnterView chatActivityEnterView = this.f33887f;
            cn0 cn0Var = chatActivityEnterView.f31119p0;
            if (cn0Var != null) {
                cn0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.L1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z9 = this.f33883a;
        ChatActivityEnterView chatActivityEnterView = this.f33887f;
        if (z9) {
            int i7 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
            chatActivityEnterView.f31119p0.setVisibility(0);
        }
        cn0 cn0Var = chatActivityEnterView.f31119p0;
        if (cn0Var != null) {
            cn0Var.setAlpha(this.f33884b);
            chatActivityEnterView.f31119p0.setTranslationX(this.f33885c);
            f10 = chatActivityEnterView.f31119p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        hi.y yVar = chatActivityEnterView.f31098l0;
        if (yVar != null && yVar.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
