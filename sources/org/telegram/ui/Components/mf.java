package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class mf extends AnimatorListenerAdapter {

    public final boolean f30665a;

    public final float f30666b;

    public final float f30667c;
    public final float d;

    public final float f30668e;

    public final ChatActivityEnterView f30669f;

    public mf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f30669f = chatActivityEnterView;
        this.f30665a = z10;
        this.f30666b = f10;
        this.f30667c = f11;
        this.d = f12;
        this.f30668e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float translationX;
        ChatActivityEnterView chatActivityEnterView = this.f30669f;
        boolean z10 = this.f30665a;
        if (z10) {
            int i10 = ChatActivityEnterView.f26070i5;
            chatActivityEnterView.b0();
        }
        go0 go0Var = chatActivityEnterView.f26137l0;
        if (go0Var != null) {
            go0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.f26137l0.setAlpha(this.d);
            chatActivityEnterView.f26137l0.setTranslationX(this.f30668e);
            translationX = chatActivityEnterView.f26137l0.getTranslationX();
        } else {
            translationX = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(translationX);
        chatActivityEnterView.C = translationX;
        chatActivityEnterView.I1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f30665a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30669f;
        go0 go0Var = chatActivityEnterView.f26137l0;
        if (go0Var != null) {
            go0Var.setVisibility(8);
        }
        chatActivityEnterView.M0.setTranslationX(0.0f);
        chatActivityEnterView.C = 0.0f;
        chatActivityEnterView.I1();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float translationX;
        boolean z10 = this.f30665a;
        ChatActivityEnterView chatActivityEnterView = this.f30669f;
        if (z10) {
            int i10 = ChatActivityEnterView.f26070i5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f26137l0.setVisibility(0);
        }
        go0 go0Var = chatActivityEnterView.f26137l0;
        if (go0Var != null) {
            go0Var.setAlpha(this.f30666b);
            chatActivityEnterView.f26137l0.setTranslationX(this.f30667c);
            translationX = chatActivityEnterView.f26137l0.getTranslationX();
        } else {
            translationX = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(translationX);
        chatActivityEnterView.C = translationX;
        chatActivityEnterView.I1();
        nh.a0 a0Var = chatActivityEnterView.f26116h0;
        if (a0Var == null || a0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.f26199x0.clear();
    }
}
