package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg extends AnimatorListenerAdapter {
    public final boolean f24942a;
    public final float f24943b;
    public final float f24944c;
    public final float d;
    public final float f24945e;
    public final ChatActivityEnterView f24946f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f24946f = chatActivityEnterView;
        this.f24942a = z10;
        this.f24943b = f7;
        this.f24944c = f10;
        this.d = f11;
        this.f24945e = f12;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24946f;
        boolean z10 = this.f24942a;
        if (z10) {
            int i11 = ChatActivityEnterView.f23846n5;
            chatActivityEnterView.b0();
        }
        pp0 pp0Var = chatActivityEnterView.f23936p0;
        if (pp0Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pp0Var.setVisibility(i10);
            chatActivityEnterView.f23936p0.setAlpha(this.d);
            chatActivityEnterView.f23936p0.setTranslationX(this.f24945e);
            f7 = chatActivityEnterView.f23936p0.getTranslationX();
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
        if (!this.f24942a) {
            ChatActivityEnterView chatActivityEnterView = this.f24946f;
            pp0 pp0Var = chatActivityEnterView.f23936p0;
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
        boolean z10 = this.f24942a;
        ChatActivityEnterView chatActivityEnterView = this.f24946f;
        if (z10) {
            int i10 = ChatActivityEnterView.f23846n5;
            chatActivityEnterView.b0();
            chatActivityEnterView.f23936p0.setVisibility(0);
        }
        pp0 pp0Var = chatActivityEnterView.f23936p0;
        if (pp0Var != null) {
            pp0Var.setAlpha(this.f24943b);
            chatActivityEnterView.f23936p0.setTranslationX(this.f24944c);
            f7 = chatActivityEnterView.f23936p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        ei.d0 d0Var = chatActivityEnterView.f23916l0;
        if (d0Var != null && d0Var.getTag() == null) {
            chatActivityEnterView.B0.clear();
        }
    }
}
