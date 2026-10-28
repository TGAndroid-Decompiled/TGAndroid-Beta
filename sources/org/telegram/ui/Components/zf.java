package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf extends AnimatorListenerAdapter {
    public final boolean f35328a;
    public final float f35329b;
    public final float f35330c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f35331f;

    public zf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f35331f = chatActivityEnterView;
        this.f35328a = z10;
        this.f35329b = f7;
        this.f35330c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f35331f;
        boolean z10 = this.f35328a;
        if (z10) {
            int i11 = ChatActivityEnterView.f25845r5;
            chatActivityEnterView.X();
        }
        dq0 dq0Var = chatActivityEnterView.f25937p0;
        if (dq0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dq0Var.setVisibility(i10);
            chatActivityEnterView.f25937p0.setAlpha(this.d);
            chatActivityEnterView.f25937p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.f25937p0.getTranslationX();
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
        if (!this.f35328a) {
            ChatActivityEnterView chatActivityEnterView = this.f35331f;
            dq0 dq0Var = chatActivityEnterView.f25937p0;
            if (dq0Var != null) {
                dq0Var.setVisibility(8);
            }
            chatActivityEnterView.Q0.setTranslationX(0.0f);
            chatActivityEnterView.G = 0.0f;
            chatActivityEnterView.G1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.f35328a;
        ChatActivityEnterView chatActivityEnterView = this.f35331f;
        if (z10) {
            int i10 = ChatActivityEnterView.f25845r5;
            chatActivityEnterView.X();
            chatActivityEnterView.f25937p0.setVisibility(0);
        }
        dq0 dq0Var = chatActivityEnterView.f25937p0;
        if (dq0Var != null) {
            dq0Var.setAlpha(this.f35329b);
            chatActivityEnterView.f25937p0.setTranslationX(this.f35330c);
            f7 = chatActivityEnterView.f25937p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.G1();
        hi.i0 i0Var = chatActivityEnterView.f25915l0;
        if (i0Var != null && i0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
