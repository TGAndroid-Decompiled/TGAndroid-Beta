package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg extends AnimatorListenerAdapter {
    public final boolean f25694a;
    public final float f25695b;
    public final float f25696c;
    public final float d;
    public final float f25697e;
    public final ChatActivityEnterView f25698f;

    public eg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f25698f = chatActivityEnterView;
        this.f25694a = z10;
        this.f25695b = f7;
        this.f25696c = f10;
        this.d = f11;
        this.f25697e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25698f;
        boolean z10 = this.f25694a;
        if (z10) {
            int i11 = ChatActivityEnterView.S5;
            chatActivityEnterView.c0();
        }
        hq0 hq0Var = chatActivityEnterView.f23708p0;
        if (hq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hq0Var.setVisibility(i10);
            chatActivityEnterView.f23708p0.setAlpha(this.d);
            chatActivityEnterView.f23708p0.setTranslationX(this.f25697e);
            f7 = chatActivityEnterView.f23708p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.M1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25694a) {
            ChatActivityEnterView chatActivityEnterView = this.f25698f;
            hq0 hq0Var = chatActivityEnterView.f23708p0;
            if (hq0Var != null) {
                hq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.M1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f25694a;
        ChatActivityEnterView chatActivityEnterView = this.f25698f;
        if (z10) {
            int i10 = ChatActivityEnterView.S5;
            chatActivityEnterView.c0();
            chatActivityEnterView.f23708p0.setVisibility(0);
        }
        hq0 hq0Var = chatActivityEnterView.f23708p0;
        if (hq0Var != null) {
            hq0Var.setAlpha(this.f25695b);
            chatActivityEnterView.f23708p0.setTranslationX(this.f25696c);
            f7 = chatActivityEnterView.f23708p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.M1();
        ei.c0 c0Var = chatActivityEnterView.f23686l0;
        if (c0Var != null && c0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
