package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f35313a;
    public final float f35314b;
    public final float f35315c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f35316f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f35316f = chatActivityEnterView;
        this.f35313a = z10;
        this.f35314b = f7;
        this.f35315c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f35316f;
        boolean z10 = this.f35313a;
        if (z10) {
            int i11 = ChatActivityEnterView.f25841r5;
            chatActivityEnterView.Y();
        }
        cq0 cq0Var = chatActivityEnterView.f25933p0;
        if (cq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            cq0Var.setVisibility(i10);
            chatActivityEnterView.f25933p0.setAlpha(this.d);
            chatActivityEnterView.f25933p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f25933p0.getTranslationX();
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
        if (!this.f35313a) {
            ChatActivityEnterView chatActivityEnterView = this.f35316f;
            cq0 cq0Var = chatActivityEnterView.f25933p0;
            if (cq0Var != null) {
                cq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f35313a;
        ChatActivityEnterView chatActivityEnterView = this.f35316f;
        if (z10) {
            int i10 = ChatActivityEnterView.f25841r5;
            chatActivityEnterView.Y();
            chatActivityEnterView.f25933p0.setVisibility(0);
        }
        cq0 cq0Var = chatActivityEnterView.f25933p0;
        if (cq0Var != null) {
            cq0Var.setAlpha(this.f35314b);
            chatActivityEnterView.f25933p0.setTranslationX(this.f35315c);
            f7 = chatActivityEnterView.f25933p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        hi.i0 i0Var = chatActivityEnterView.f25911l0;
        if (i0Var != null && i0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
