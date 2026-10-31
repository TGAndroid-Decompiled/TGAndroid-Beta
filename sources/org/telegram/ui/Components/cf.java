package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf extends AnimatorListenerAdapter {
    public final boolean f25063a;
    public final float f25064b;
    public final float f25065c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f25066f;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25066f = chatActivityEnterView;
        this.f25063a = z10;
        this.f25064b = f7;
        this.f25065c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25066f;
        boolean z10 = this.f25063a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23672s5;
            chatActivityEnterView.X();
        }
        do0 do0Var = chatActivityEnterView.f23764p0;
        if (do0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            do0Var.setVisibility(i10);
            chatActivityEnterView.f23764p0.setAlpha(this.d);
            chatActivityEnterView.f23764p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f23764p0.getTranslationX();
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
        if (!this.f25063a) {
            ChatActivityEnterView chatActivityEnterView = this.f25066f;
            do0 do0Var = chatActivityEnterView.f23764p0;
            if (do0Var != null) {
                do0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25063a;
        ChatActivityEnterView chatActivityEnterView = this.f25066f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23672s5;
            chatActivityEnterView.X();
            chatActivityEnterView.f23764p0.setVisibility(0);
        }
        do0 do0Var = chatActivityEnterView.f23764p0;
        if (do0Var != null) {
            do0Var.setAlpha(this.f25064b);
            chatActivityEnterView.f23764p0.setTranslationX(this.f25065c);
            f7 = chatActivityEnterView.f23764p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        xh.w wVar = chatActivityEnterView.f23742l0;
        if (wVar != null && wVar.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
