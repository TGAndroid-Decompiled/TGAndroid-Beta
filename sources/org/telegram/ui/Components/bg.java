package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f24947a;
    public final float f24948b;
    public final float f24949c;
    public final float d;
    public final float f24950e;
    public final ChatActivityEnterView f24951f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f24951f = chatActivityEnterView;
        this.f24947a = z10;
        this.f24948b = f7;
        this.f24949c = f10;
        this.d = f11;
        this.f24950e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24951f;
        boolean z10 = this.f24947a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23851n5;
            chatActivityEnterView.b0();
        }
        pp0 pp0Var = chatActivityEnterView.f23941p0;
        if (pp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pp0Var.setVisibility(i10);
            chatActivityEnterView.f23941p0.setAlpha(this.d);
            chatActivityEnterView.f23941p0.setTranslationX(this.f24950e);
            f7 = chatActivityEnterView.f23941p0.getTranslationX();
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
        if (!this.f24947a) {
            ChatActivityEnterView chatActivityEnterView = this.f24951f;
            pp0 pp0Var = chatActivityEnterView.f23941p0;
            if (pp0Var != null) {
                pp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.I1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f24947a;
        ChatActivityEnterView chatActivityEnterView = this.f24951f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23851n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f23941p0.setVisibility(0);
        }
        pp0 pp0Var = chatActivityEnterView.f23941p0;
        if (pp0Var != null) {
            pp0Var.setAlpha(this.f24948b);
            chatActivityEnterView.f23941p0.setTranslationX(this.f24949c);
            f7 = chatActivityEnterView.f23941p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.d0 d0Var = chatActivityEnterView.f23921l0;
        if (d0Var != null && d0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
