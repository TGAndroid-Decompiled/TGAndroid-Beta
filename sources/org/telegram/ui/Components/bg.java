package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f23753a;
    public final float f23754b;
    public final float f23755c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f23756f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f23756f = chatActivityEnterView;
        this.f23753a = z10;
        this.f23754b = f7;
        this.f23755c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f23756f;
        boolean z10 = this.f23753a;
        if (z10) {
            int i11 = ChatActivityEnterView.f22849n5;
            chatActivityEnterView.Z();
        }
        xp0 xp0Var = chatActivityEnterView.f22939p0;
        if (xp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xp0Var.setVisibility(i10);
            chatActivityEnterView.f22939p0.setAlpha(this.d);
            chatActivityEnterView.f22939p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22939p0.getTranslationX();
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
        if (!this.f23753a) {
            ChatActivityEnterView chatActivityEnterView = this.f23756f;
            xp0 xp0Var = chatActivityEnterView.f22939p0;
            if (xp0Var != null) {
                xp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.H1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f23753a;
        ChatActivityEnterView chatActivityEnterView = this.f23756f;
        if (z10) {
            int i10 = ChatActivityEnterView.f22849n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f22939p0.setVisibility(0);
        }
        xp0 xp0Var = chatActivityEnterView.f22939p0;
        if (xp0Var != null) {
            xp0Var.setAlpha(this.f23754b);
            chatActivityEnterView.f22939p0.setTranslationX(this.f23755c);
            f7 = chatActivityEnterView.f22939p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.H1();
        fi.b0 b0Var = chatActivityEnterView.f22919l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
