package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf extends AnimatorListenerAdapter {
    public final boolean f30379a;
    public final float f30380b;
    public final float f30381c;
    public final float d;
    public final float f30382e;
    public final ChatActivityEnterView f30383f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z4, float f10, float f11, float f12, float f13) {
        this.f30383f = chatActivityEnterView;
        this.f30379a = z4;
        this.f30380b = f10;
        this.f30381c = f11;
        this.d = f12;
        this.f30382e = f13;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f30383f;
        boolean z4 = this.f30379a;
        if (z4) {
            int i11 = ChatActivityEnterView.f24568j5;
            chatActivityEnterView.b0();
        }
        bp0 bp0Var = chatActivityEnterView.m0;
        if (bp0Var != null) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            bp0Var.setVisibility(i10);
            chatActivityEnterView.m0.setAlpha(this.d);
            chatActivityEnterView.m0.setTranslationX(this.f30382e);
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
        if (!this.f30379a) {
            ChatActivityEnterView chatActivityEnterView = this.f30383f;
            bp0 bp0Var = chatActivityEnterView.m0;
            if (bp0Var != null) {
                bp0Var.setVisibility(8);
            }
            chatActivityEnterView.N0.setTranslationX(0.0f);
            chatActivityEnterView.D = 0.0f;
            chatActivityEnterView.J1();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z4 = this.f30379a;
        ChatActivityEnterView chatActivityEnterView = this.f30383f;
        if (z4) {
            int i10 = ChatActivityEnterView.f24568j5;
            chatActivityEnterView.b0();
            chatActivityEnterView.m0.setVisibility(0);
        }
        bp0 bp0Var = chatActivityEnterView.m0;
        if (bp0Var != null) {
            bp0Var.setAlpha(this.f30380b);
            chatActivityEnterView.m0.setTranslationX(this.f30381c);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        sh.z zVar = chatActivityEnterView.f24620i0;
        if (zVar != null && zVar.getTag() == null) {
            chatActivityEnterView.f24705y0.clear();
        }
    }
}
