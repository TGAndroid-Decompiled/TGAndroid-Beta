package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf extends AnimatorListenerAdapter {
    public final boolean f34301a;
    public final float f34302b;
    public final float f34303c;
    public final float d;
    public final float f34304e;
    public final ChatActivityEnterView f34305f;

    public hf(ChatActivityEnterView chatActivityEnterView, boolean z9, float f10, float f11, float f12, float f13) {
        this.f34305f = chatActivityEnterView;
        this.f34301a = z9;
        this.f34302b = f10;
        this.f34303c = f11;
        this.d = f12;
        this.f34304e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f34305f;
        boolean z9 = this.f34301a;
        if (z9) {
            int i10 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
        }
        cn0 cn0Var = chatActivityEnterView.f31099p0;
        if (cn0Var != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            cn0Var.setVisibility(i7);
            chatActivityEnterView.f31099p0.setAlpha(this.d);
            chatActivityEnterView.f31099p0.setTranslationX(this.f34304e);
            f10 = chatActivityEnterView.f31099p0.getTranslationX();
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
        if (!this.f34301a) {
            ChatActivityEnterView chatActivityEnterView = this.f34305f;
            cn0 cn0Var = chatActivityEnterView.f31099p0;
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
        boolean z9 = this.f34301a;
        ChatActivityEnterView chatActivityEnterView = this.f34305f;
        if (z9) {
            int i7 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
            chatActivityEnterView.f31099p0.setVisibility(0);
        }
        cn0 cn0Var = chatActivityEnterView.f31099p0;
        if (cn0Var != null) {
            cn0Var.setAlpha(this.f34302b);
            chatActivityEnterView.f31099p0.setTranslationX(this.f34303c);
            f10 = chatActivityEnterView.f31099p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        hi.y yVar = chatActivityEnterView.f31078l0;
        if (yVar != null && yVar.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
