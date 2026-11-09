package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf extends AnimatorListenerAdapter {
    public final boolean f34283a;
    public final float f34284b;
    public final float f34285c;
    public final float d;
    public final float f34286e;
    public final ChatActivityEnterView f34287f;

    public hf(ChatActivityEnterView chatActivityEnterView, boolean z9, float f10, float f11, float f12, float f13) {
        this.f34287f = chatActivityEnterView;
        this.f34283a = z9;
        this.f34284b = f10;
        this.f34285c = f11;
        this.d = f12;
        this.f34286e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f34287f;
        boolean z9 = this.f34283a;
        if (z9) {
            int i10 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
        }
        dn0 dn0Var = chatActivityEnterView.f31108p0;
        if (dn0Var != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dn0Var.setVisibility(i7);
            chatActivityEnterView.f31108p0.setAlpha(this.d);
            chatActivityEnterView.f31108p0.setTranslationX(this.f34286e);
            f10 = chatActivityEnterView.f31108p0.getTranslationX();
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
        if (!this.f34283a) {
            ChatActivityEnterView chatActivityEnterView = this.f34287f;
            dn0 dn0Var = chatActivityEnterView.f31108p0;
            if (dn0Var != null) {
                dn0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.L1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z9 = this.f34283a;
        ChatActivityEnterView chatActivityEnterView = this.f34287f;
        if (z9) {
            int i7 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
            chatActivityEnterView.f31108p0.setVisibility(0);
        }
        dn0 dn0Var = chatActivityEnterView.f31108p0;
        if (dn0Var != null) {
            dn0Var.setAlpha(this.f34284b);
            chatActivityEnterView.f31108p0.setTranslationX(this.f34285c);
            f10 = chatActivityEnterView.f31108p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        hi.y yVar = chatActivityEnterView.f31087l0;
        if (yVar != null && yVar.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
