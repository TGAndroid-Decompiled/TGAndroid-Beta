package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f21822a;
    public final float f21823b;
    public final float f21824c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f21825f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f21825f = chatActivityEnterView;
        this.f21822a = z10;
        this.f21823b = f7;
        this.f21824c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f21825f;
        boolean z10 = this.f21822a;
        if (z10) {
            int i11 = ChatActivityEnterView.f20816m5;
            chatActivityEnterView.b0();
        }
        hp0 hp0Var = chatActivityEnterView.f20904p0;
        if (hp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hp0Var.setVisibility(i10);
            chatActivityEnterView.f20904p0.setAlpha(this.d);
            chatActivityEnterView.f20904p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f20904p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f21822a) {
            ChatActivityEnterView chatActivityEnterView = this.f21825f;
            hp0 hp0Var = chatActivityEnterView.f20904p0;
            if (hp0Var != null) {
                hp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f21822a;
        ChatActivityEnterView chatActivityEnterView = this.f21825f;
        if (z10) {
            int i10 = ChatActivityEnterView.f20816m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f20904p0.setVisibility(0);
        }
        hp0 hp0Var = chatActivityEnterView.f20904p0;
        if (hp0Var != null) {
            hp0Var.setAlpha(this.f21823b);
            chatActivityEnterView.f20904p0.setTranslationX(this.f21824c);
            f7 = chatActivityEnterView.f20904p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        di.f0 f0Var = chatActivityEnterView.f20885l0;
        if (f0Var != null && f0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
