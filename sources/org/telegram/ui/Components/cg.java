package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg extends AnimatorListenerAdapter {
    public final boolean f25364a;
    public final float f25365b;
    public final float f25366c;
    public final float d;
    public final float f25367e;
    public final ChatActivityEnterView f25368f;

    public cg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25368f = chatActivityEnterView;
        this.f25364a = z10;
        this.f25365b = f7;
        this.f25366c = f10;
        this.d = f11;
        this.f25367e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25368f;
        boolean z10 = this.f25364a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23850n5;
            chatActivityEnterView.Z();
        }
        bq0 bq0Var = chatActivityEnterView.f23940p0;
        if (bq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            bq0Var.setVisibility(i10);
            chatActivityEnterView.f23940p0.setAlpha(this.d);
            chatActivityEnterView.f23940p0.setTranslationX(this.f25367e);
            f7 = chatActivityEnterView.f23940p0.getTranslationX();
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
        if (!this.f25364a) {
            ChatActivityEnterView chatActivityEnterView = this.f25368f;
            bq0 bq0Var = chatActivityEnterView.f23940p0;
            if (bq0Var != null) {
                bq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.H1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25364a;
        ChatActivityEnterView chatActivityEnterView = this.f25368f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23850n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f23940p0.setVisibility(0);
        }
        bq0 bq0Var = chatActivityEnterView.f23940p0;
        if (bq0Var != null) {
            bq0Var.setAlpha(this.f25365b);
            chatActivityEnterView.f23940p0.setTranslationX(this.f25366c);
            f7 = chatActivityEnterView.f23940p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        ei.c0 c0Var = chatActivityEnterView.f23920l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
