package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f23447a;
    public final float f23448b;
    public final float f23449c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f23450f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f23450f = chatActivityEnterView;
        this.f23447a = z10;
        this.f23448b = f7;
        this.f23449c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f23450f;
        boolean z10 = this.f23447a;
        if (z10) {
            int i11 = ChatActivityEnterView.f22549n5;
            chatActivityEnterView.Z();
        }
        xp0 xp0Var = chatActivityEnterView.f22639p0;
        if (xp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xp0Var.setVisibility(i10);
            chatActivityEnterView.f22639p0.setAlpha(this.d);
            chatActivityEnterView.f22639p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f22639p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23447a) {
            ChatActivityEnterView chatActivityEnterView = this.f23450f;
            xp0 xp0Var = chatActivityEnterView.f22639p0;
            if (xp0Var != null) {
                xp0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f23447a;
        ChatActivityEnterView chatActivityEnterView = this.f23450f;
        if (z10) {
            int i10 = ChatActivityEnterView.f22549n5;
            chatActivityEnterView.Z();
            chatActivityEnterView.f22639p0.setVisibility(0);
        }
        xp0 xp0Var = chatActivityEnterView.f22639p0;
        if (xp0Var != null) {
            xp0Var.setAlpha(this.f23448b);
            chatActivityEnterView.f22639p0.setTranslationX(this.f23449c);
            f7 = chatActivityEnterView.f22639p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        fi.b0 b0Var = chatActivityEnterView.f22619l0;
        if (b0Var != null && b0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
