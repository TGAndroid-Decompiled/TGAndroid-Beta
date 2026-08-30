package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final boolean f28123a;
    public final float f28124b;
    public final float f28125c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f28126f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z4, float f10, float f11, float f12, float f13) {
        this.f28126f = chatActivityEnterView;
        this.f28123a = z4;
        this.f28124b = f10;
        this.f28125c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28126f;
        boolean z4 = this.f28123a;
        if (z4) {
            int i11 = ChatActivityEnterView.f22729j5;
            chatActivityEnterView.b0();
        }
        ap0 ap0Var = chatActivityEnterView.m0;
        if (ap0Var != null) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ap0Var.setVisibility(i10);
            chatActivityEnterView.m0.setAlpha(this.d);
            chatActivityEnterView.m0.setTranslationX(this.e);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f28123a) {
            ChatActivityEnterView chatActivityEnterView = this.f28126f;
            ap0 ap0Var = chatActivityEnterView.m0;
            if (ap0Var != null) {
                ap0Var.setVisibility(8);
            }
            chatActivityEnterView.N0.setTranslationX(0.0f);
            chatActivityEnterView.D = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z4 = this.f28123a;
        ChatActivityEnterView chatActivityEnterView = this.f28126f;
        if (z4) {
            int i10 = ChatActivityEnterView.f22729j5;
            chatActivityEnterView.b0();
            chatActivityEnterView.m0.setVisibility(0);
        }
        ap0 ap0Var = chatActivityEnterView.m0;
        if (ap0Var != null) {
            ap0Var.setAlpha(this.f28124b);
            chatActivityEnterView.m0.setTranslationX(this.f28125c);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        rh.a0 a0Var = chatActivityEnterView.f22780i0;
        if (a0Var != null && a0Var.getTag() == null) {
            chatActivityEnterView.f22865y0.clear();
        }
    }
}
